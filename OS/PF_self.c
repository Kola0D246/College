// PF (Priority First): Process that higher priority, gets CPU first
// Premptive: CPU is switch to higher priority process even if current process is not completed
#include <stdio.h>
#include <stdlib.h>

struct Process {
    int pid;
    int arrival;
    int burst;
    int priority;
    int left;
    int completion;
    int turnaround;
    int waiting;
};

struct Process create(int pid, int arrival, int burst, int priority){
    struct Process P;
    P.pid = pid;
    P.arrival = arrival;
    P.burst = burst;
    P.priority = priority;
    P.left = burst;
    P.completion = -1;
    P.turnaround= -1;
    P.waiting= -1;
    return P;
}

int compareArrival(const void *a, const void *b) {
    const struct Process *p1 = (const struct Process *)a;
    const struct Process *p2 = (const struct Process *)b;
    return p1->arrival - p2->arrival;
}

/////////////////// DRIVER FUNCTION /////////////////////
int main() {
    int count=0; int clock=0; int i=0; int finished=0;
    float accTurnaround=0; float accWaiting=0;

    struct Process P0 = create(++count, 4, 6, 2);
    struct Process P1 = create(++count, 2, 1, 1);
    struct Process P2 = create(++count, 2, 2, 3);
    struct Process P3 = create(++count, 3, 2, 2);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qsort(readyQ, count, sizeof(struct Process), compareArrival);
    printf("id | CT | TAT | WT\n");

    while (finished < count){
        // goes to next iteration if this process is already been completed
        if (readyQ[i].left == 0){
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
            if (readyQ[j].priority < readyQ[i].priority) {
                i = j;
            }
        }

        clock++;
        readyQ[i].left--;
        if (readyQ[i].left == 0) {
            readyQ[i].completion = clock;
            finished++;
        }
        i=temp;
    }

    for (int i=0; i<count; i++){
        readyQ[i].turnaround = readyQ[i].completion - readyQ[i].arrival;
        readyQ[i].waiting = readyQ[i].turnaround - readyQ[i].burst;
        printf("%d | %d | %d | %d\n", readyQ[i].pid, readyQ[i].completion, readyQ[i].turnaround, readyQ[i].waiting);
        accTurnaround+=readyQ[i].turnaround;
        accWaiting+=readyQ[i].waiting;
    }

    printf("Average turnaround time = %.2f\n", accTurnaround/count);
    printf("Average waiting time = %.2f\n", accWaiting/count);
}