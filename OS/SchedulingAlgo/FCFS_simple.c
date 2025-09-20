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
    int count=0; int clock=0; int i=0;
    float accTurnaround=0; float accWaiting=0;

    struct Process P0 = create(++count, 6, 4);
    struct Process P1 = create(++count, 0, 2);
    struct Process P2 = create(++count, 1, 2);
    struct Process P3 = create(++count, 5, 3);
    struct Process readyQ[] = {P0, P1, P2, P3};

    qSort(readyQ, 0, count-1);

    while (i<count){
        // skip when CPU is idle
        if (readyQ[i].arrival > clock){
            clock= readyQ[i].arrival;
        }
        for (int j=i+1; j<count; j++){
            if (readyQ[j].arrival != readyQ[i].arrival){
                break;
            }
            
        }
        i++;
    }
    
    
    
    
    
    
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

