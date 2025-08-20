//Linear Search
#include <stdio.h>

int main() {
    int array[] = {11, 12, 13, 14, 15};
    int len = sizeof(array) / sizeof(array[0]);     
    //len of array = size of array / size of one element

    int key;        // element to be searched
    printf("Enter the number you want to search for: ");
    scanf("%d", &key);

    for (int i=0; i<len; i++) {
        if (array[i] == key) {
            printf("Found %d at index %d\n", key, i);
            break;
        } 
        else if (i == len - 1) {
            // If we reach the last element and haven't found the key
            printf("%d not found in the array\n", key);
        }
    }
}

//TC: O(n) - In the worst case, we may have to check every element in the array.
//SC: O(1) - We are using a constant amount of space for the variables.