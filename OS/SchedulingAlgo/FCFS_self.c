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
    return P;
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
    struct Process P0 = create(++count, 6, 4);
    struct Process P1 = create(++count, 0, 2);
    struct Process P2 = create(++count, 1, 2);
    struct Process P3 = create(++count, 5, 3);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qSort(readyQ, 0, count-1);

    for (int i=0; i<count;i++){
        while (1) {
            if (block > clock){
                clock++;
                break;
            }
            if (clock >= readyQ[i].arrival){
                block = readyQ[i].completed = clock+readyQ[i].burst;
                printf("%d | %d\n", clock, readyQ[i].pid);
                printf("%d completed at %d\n", readyQ[i].pid, readyQ[i].completed);
                clock++;
                break;
            }
            printf("%d | %d\n", clock, readyQ[i].pid);
            clock++;
        }
    }
}

