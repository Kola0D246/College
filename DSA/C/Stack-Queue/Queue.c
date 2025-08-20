#include <stdio.h>
#include <stdlib.h>
#define MAX 100

int queue[MAX];
int front = -1, rear = -1;

void enqueue(int val) {
    if (rear == MAX - 1) {
        printf("Queue Overflow\n");
        return;
    }
    if (front == -1) front = 0;
    queue[++rear] = val;
    printf("%d enqueued\n", val);
}

void dequeue() {
    if (front == -1 || front > rear) {
        printf("Queue Underflow\n");
        return;
    }
    printf("%d dequeued\n", queue[front++]);
    if (front > rear) front = rear = -1;
}

void traverse() {
    if (front == -1) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements:\n");
    for (int i = front; i <= rear; i++)
        printf("%d ", queue[i]);
    printf("\n");
}

void search(int val) {
    for (int i = front; i <= rear; i++) {
        if (queue[i] == val) {
            printf("%d found at position %d\n", val, i - front + 1);
            return;
        }
    }
    printf("%d not found in queue\n", val);
}

int size() {
    return (front == -1) ? 0 : rear - front + 1;
}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    traverse();
    search(20);
    dequeue();
    traverse();
    printf("Size: %d\n", size());
    return 0;
}
