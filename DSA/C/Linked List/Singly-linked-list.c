// Singly linked list
#include <stdio.h>
#include <stdlib.h>

//define node structure
struct Node {       
    int data;
    struct Node* next;      //Now struct Node* act as datatype for linked list nodes
};

// insert at the beginning of the linked list
void insertAtBeginning(struct Node** head, int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));

    newNode->data = data;
    newNode->next = *head;
    *head = newNode;
}

// Insert at the end
void insertAtEnd(struct Node** head, int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;

    if (*head == NULL) {
        *head = newNode;
        return;
    }

    struct Node* temp = *head;
    while (temp->next != NULL)
        temp = temp->next;

    temp->next = newNode;
}

// Insert after a specific value
void insertAfter(struct Node* head, int target, int data) {
    while (head != NULL && head->data != target)
        head = head->next;

    if (head == NULL) {
        printf("Element %d not found, cannot insert after it.\n", target);
        return;
    }

    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = head->next;
    head->next = newNode;
}

//traverse the linked list and print elements
void traverse(struct Node* head) {
    printf("Linked List: ");
    while (head != NULL) {
        printf("%d -> ", head->data);
        head = head->next;
    }
    printf("NULL\n");
}

// Search for an element
void search(struct Node* head, int key) {
    int position = 0;
    while (head != NULL) {
        if (head->data == key) {
            printf("Element %d found at position %d\n", key, position);
            return;
        }
        head = head->next;
        position++;
    }
    printf("Element %d not found in the list.\n", key);
}

// Delete a node by value
void deleteNode(struct Node** head, int key) {
    struct Node *temp = *head, *prev = NULL;

    // If head node holds the key
    if (temp != NULL && temp->data == key) {
        *head = temp->next;
        free(temp);
        printf("Element %d deleted from the list.\n", key);
        return;
    }

    // Search for the key
    while (temp != NULL && temp->data != key) {
        prev = temp;
        temp = temp->next;
    }

    // If not found
    if (temp == NULL) {
        printf("Element %d not found in the list.\n", key);
        return;
    }

    prev->next = temp->next;
    free(temp);
    printf("Element %d deleted from the list.\n", key);
}

// Main function to demonstrate operations
int main() {
    // Initialize the linked list by setting head to NULL (link list is empty)
    struct Node* head = NULL;

    // Insert initial elements
    insertAtEnd(&head, 10);
    insertAtEnd(&head, 20);
    insertAtEnd(&head, 30);
    traverse(head);

    // Insert at beginning
    insertAtBeginning(&head, 5);
    traverse(head);

    // Insert after 20
    insertAfter(head, 20, 25);
    traverse(head);

    // Search for an element
    search(head, 25);
    search(head, 100);

    // Delete a node
    deleteNode(&head, 10);
    traverse(head);

    deleteNode(&head, 100);  // Attempt to delete non-existing value

    return 0;
}
