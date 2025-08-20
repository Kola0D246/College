#include <stdio.h>
#define MAX 5

int cqueue[MAX];
int front = -1, rear = -1;

void enqueue(int val) {
    if ((rear + 1) % MAX == front) {
        printf("Circular Queue Overflow\n");
        return;
    }
    if (front == -1) front = 0;
    rear = (rear + 1) % MAX;
    cqueue[rear] = val;
    printf("%d enqueued\n", val);
}

void dequeue() {
    if (front == -1) {
        printf("Circular Queue Underflow\n");
        return;
    }
    printf("%d dequeued\n", cqueue[front]);
    if (front == rear) front = rear = -1;
    else front = (front + 1) % MAX;
}

void traverse() {
    if (front == -1) {
        printf("Circular Queue is empty\n");
        return;
    }
    printf("Circular Queue elements:\n");
    int i = front;
    while (1) {
        printf("%d ", cqueue[i]);
        if (i == rear) break;
        i = (i + 1) % MAX;
    }
    printf("\n");
}
