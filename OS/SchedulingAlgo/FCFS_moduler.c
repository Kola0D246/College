// FCFS (First Come First Serve): Process that comes first in ready-queue, gets CPU first
// Non-primitve: CPU is allocated to next process only after completion of current process
#include <stdio.h>

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

void completion(struct Process* P, int* clock){
    if (P->arrival > *clock){
        *clock= P->arrival;
    }
    P->completed = *clock + P->burst;
    *clock = P->completed;
}

void turnaround(struct Process*P){
    if (P->completed == -1){
        printf("Calculate completion time first\n");
    }
    else {
        P->turnaround = P->completed - P->arrival;
    }
}

void waiting(struct Process*P){
    if (P->turnaround == -1){
        printf("Calculate turnaround time first\n");
    }
    else {
        P->waiting = P->turnaround - P->burst;
    }
}

//////////////////// QUICK SORT /////////////////////////
void swap(struct Process *a, struct Process *b) {
    struct Process temp = *a;
    *a = *b;
    *b = temp;
}

void qSort(struct Process arr[], int low, int high) {
    if (low < high) {
        int pivot = arr[high].arrival;  // pivot = last element's arrival
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j].arrival <= pivot) {
                swap(&arr[i++], &arr[j]);
            }
        }

        swap(&arr[i], &arr[high]);

        // Recursively sort left and right partitions
        qSort(arr, low, i - 1);
        qSort(arr, i + 1, high);
    }
}

/////////////////// DRIVER FUNCTION /////////////////////
int main() {
    int count=0; int clock=0; int block=0;
    float accTurnaround=0; float accWaiting=0;

    struct Process P0 = create(++count, 6, 4);
    struct Process P1 = create(++count, 0, 2);
    struct Process P2 = create(++count, 1, 2);
    struct Process P3 = create(++count, 5, 3);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qSort(readyQ, 0, count-1);

    for (int i=0; i<count;i++){
        completion(&readyQ[i], &clock);
        turnaround(&readyQ[i]);
        waiting(&readyQ[i]);
        printf("%d | %d | %d | %d\n", readyQ[i].pid, readyQ[i].completed, readyQ[i].turnaround, readyQ[i].waiting);

        accTurnaround+=readyQ[i].turnaround;
        accWaiting+=readyQ[i].waiting;
    }

    printf("Average turnaround time = %.2f\n", accTurnaround/count);
    printf("Average waiting time = %.2f\n", accWaiting/count);
}

