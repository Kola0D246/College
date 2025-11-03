// PF (Priority First): Process that higher priority, gets CPU first
// Premptive: CPU is switch to higher priority process even if current process is not completed
#include <stdio.h>
#include <stdlib.h>

struct Process {
    int pid;
    int arrival;
    int burst;
    int left;
    int completion;
    int turnaround;
    int waiting;
};

struct Process create(int pid, int arrival, int burst){
    struct Process P;
    P.pid = pid;
    P.arrival = arrival;
    P.burst = burst;
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
    int count=0, clock=0, finished=0;
    float accTurnaround=0, accWaiting=0;

    struct Process P0 = create(++count, 4, 6);
    struct Process P1 = create(++count, 2, 1);
    struct Process P2 = create(++count, 2, 2);
    struct Process P3 = create(++count, 3, 2);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qsort(readyQ, count, sizeof(struct Process), compareArrival);
    printf("id | CT | TAT | WT\n");

    while (finished < count){
        // Step 1: find process with highest priority
        int best = -1;
        for (int j=0; j<count; j++) {
            if (readyQ[j].arrival <= clock && readyQ[j].left > 0) {
                if (best == -1 || readyQ[j].left < readyQ[best].left) {
                    best = j;
                }
            }
        }

        // Step 2: If no process available, idle the CPU
        if (best == -1) {
            clock++;
            continue;
        }

        // Step 3: run selected process for 1 tick
        readyQ[best].left--;
        clock++;

        // Step 4: If process just finished, record completion
        if (readyQ[best].left == 0) {
            readyQ[best].completion = clock;
            finished++;
        }
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