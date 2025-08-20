#include <stdio.h>
#define MAX 100

int deque[MAX];
int front = -1, rear = -1;

void insertFront(int val) {
    if ((front == 0 && rear == MAX - 1) || (front == rear + 1)) {
        printf("Deque Overflow\n");
        return;
    }
    if (front == -1) front = rear = 0;
    else if (front == 0) front = MAX - 1;
    else front--;
    deque[front] = val;
    printf("%d inserted at front\n", val);
}

void insertRear(int val) {
    if ((front == 0 && rear == MAX - 1) || (front == rear + 1)) {
        printf("Deque Overflow\n");
        return;
    }
    if (front == -1) front = rear = 0;
    else if (rear == MAX - 1) rear = 0;
    else rear++;
    deque[rear] = val;
    printf("%d inserted at rear\n", val);
}

void deleteFront() {
    if (front == -1) {
        printf("Deque Underflow\n");
        return;
    }
    printf("%d deleted from front\n", deque[front]);
    if (front == rear) front = rear = -1;
    else if (front == MAX - 1) front = 0;
    else front++;
}

void deleteRear() {
    if (front == -1) {
        printf("Deque Underflow\n");
        return;
    }
    printf("%d deleted from rear\n", deque[rear]);
    if (front == rear) front = rear = -1;
    else if (rear == 0) rear = MAX - 1;
    else rear--;
}
