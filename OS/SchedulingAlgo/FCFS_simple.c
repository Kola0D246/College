// FCFS (First Come First Serve): Process that comes first in ready-queue, gets CPU first
// Non-primitve: CPU is allocated to next process only after completion of current process
#include <stdio.h>
#include <stdlib.h> 

struct Process {
    int pid;
    int arrival;
    int burst;
    int completed;
    int turnaround;
    int waiting;
};

struct Process create(int pid, int arrival, int burst){
    struct Process P;
    P.pid = pid;
    P.arrival = arrival;
    P.burst = burst;
    int completed = -1;
    int turnaround= -1;
    int waiting= -1;
    return P;
}

int compareArrival(const void *a, const void *b) {
    const struct Process *p1 = (const struct Process *)a;
    const struct Process *p2 = (const struct Process *)b;
    return p1->arrival - p2->arrival;
}

/////////////////// DRIVER FUNCTION /////////////////////
int main() {
    int count=0; int clock=0; int i=0;
    float accTurnaround=0; float accWaiting=0;

    struct Process P0 = create(++count, 6, 4);
    struct Process P1 = create(++count, 0, 2);
    struct Process P2 = create(++count, 1, 2);
    struct Process P3 = create(++count, 5, 3);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qsort(readyQ, count, sizeof(struct Process), compareArrival);
    printf("id | CT | TAT | WT\n");
    
    for (int i=0; i<count;i++){
        if (readyQ[i].arrival > clock){
            clock= readyQ[i].arrival;
        }
        readyQ[i].completed = clock+readyQ[i].burst;
        readyQ[i].turnaround = readyQ[i].completed - readyQ[i].arrival;
        readyQ[i].waiting = readyQ[i].turnaround - readyQ[i].burst;

        clock = readyQ[i].completed;
        printf("%d | %d | %d | %d\n", readyQ[i].pid, readyQ[i].completed, readyQ[i].turnaround, readyQ[i].waiting);

        accTurnaround+=readyQ[i].turnaround;
        accWaiting+=readyQ[i].waiting;
    }

    printf("Average turnaround time = %.2f\n", accTurnaround/count);
    printf("Average waiting time = %.2f\n", accWaiting/count);
}
