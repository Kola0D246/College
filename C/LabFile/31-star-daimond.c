// make diamond 

//     *    
//    ***  
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
    

#include <stdio.h>

int multStr(char* s, int n){
    for (n; n > 0; n--){
        printf("%s", s);
    }

    return 0;
}

int main(){
    for (int i = 4; i > 0; --i){
        multStr(" ", i);
        multStr("*", (5-i) + (4-i));
        printf("\n");
    }

    multStr("*", 9);
    printf("\n");

    for (int i = 1; i < 5; i++){
        multStr(" ", i);
        multStr("*", (5-i) + (4-i)); 
        printf("\n");
    }
    

    return 0;
}