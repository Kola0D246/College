#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;

// Insert at end
void insert(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    if (head == NULL) {
        head = newNode;
        head->next = head;
        return;
    }
    struct Node* temp = head;
    while (temp->next != head)
        temp = temp->next;
    temp->next = newNode;
    newNode->next = head;
}

// Delete a value
void deleteValue(int value) {
    if (head == NULL) return;
    struct Node *curr = head, *prev = NULL;
    do {
        if (curr->data == value) {
            if (curr == head && curr->next == head) {
                head = NULL;
            } else {
                if (curr == head) {
                    struct Node* last = head;
                    while (last->next != head)
                        last = last->next;
                    head = head->next;
                    last->next = head;
                } else {
                    prev->next = curr->next;
                }
            }
            free(curr);
            return;
        }
        prev = curr;
        curr = curr->next;
    } while (curr != head);
    printf("Value %d not found\n", value);
}

// Display list
void display() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct Node* temp = head;
    printf("Circular List: ");
    do {
        printf("%d ", temp->data);
        temp = temp->next;
    } while (temp != head);
    printf("\n");
}

int main() {
    insert(10);
    insert(20);
    insert(30);
    display();         // 10 20 30
    deleteValue(20);
    display();         // 10 30
    return 0;
}
