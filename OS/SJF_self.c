// SJF (Shortest Job First): Process that has first in ready-queue, gets CPU first
// Non-primitve: CPU is allocated to next process only after completion of current process
#include <stdio.h>
#include <stdlib.h>

struct Process {
    int pid;
    int arrival;
    int burst;
    int completion;
    int turnaround;
    int waiting;
};

struct Process create(int pid, int burst, int arrival){
    struct Process P;
    P.pid = pid;
    P.arrival = arrival;
    P.burst = burst;
    P.completion = P.turnaround= P.waiting= -1;
    return P;
}

int compareArrival(const void *a, const void *b) {
    const struct Process *p1 = (const struct Process *)a;
    const struct Process *p2 = (const struct Process *)b;
    return p1->arrival - p2->arrival;
}

/////////////////// DRIVER FUNCTION /////////////////////
int main() {
    int count=0, clock=0, i=0;
    float accTurnaround=0, accWaiting=0;

    struct Process P0 = create(++count, 4, 6);
    struct Process P1 = create(++count, 2, 0);
    struct Process P2 = create(++count, 2, 2);
    struct Process P3 = create(++count, 3, 2);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qsort(readyQ, count, sizeof(struct Process), compareArrival);
    printf("id | CT | TAT | WT\n");

    while (i<count){
        // goes to next iteration if this process is already been completed
        if (readyQ[i].completion != -1){
            i++;
            continue;
        }

        // skip when CPU is idle
        if (readyQ[i].arrival > clock){
            clock= readyQ[i].arrival;
        }

        int temp=i;     // store current value of i

        // iterate for next processes to check shorter burst time
        for (int j=i+1;j<count;j++){
            // if process is not arrived yet, break the loop
            if (readyQ[j].arrival > clock){
                break;
            }
            // if process has lesser burst time
            if (readyQ[j].burst < readyQ[i].burst) {
                i = j;
            }
        }

        readyQ[i].completion = clock+readyQ[i].burst;
        readyQ[i].turnaround = readyQ[i].completion - readyQ[i].arrival;
        readyQ[i].waiting = readyQ[i].turnaround - readyQ[i].burst;

        clock = readyQ[i].completion;
        printf("%d | %d | %d | %d\n", readyQ[i].pid, readyQ[i].completion, readyQ[i].turnaround, readyQ[i].waiting);

        accTurnaround+=readyQ[i].turnaround;
        accWaiting+=readyQ[i].waiting;

        i=temp;
    }

    printf("Average turnaround time = %.2f\n", accTurnaround/count);
    printf("Average waiting time = %.2f\n", accWaiting/count);
}