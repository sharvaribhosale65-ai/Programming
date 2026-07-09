#include<stdio.h>

#pragma pack(1)                                     //remove padding

struct node
{
    int data;                                       //4byte
    struct node *next;                              //8byte
};

typedef struct node NODE;
typedef struct node * PNODE;

int main()
{
    PNODE head = NULL;                              //pointer

    NODE obj1, obj2, obj3;                          //declaration

    head = &obj1;                                   //address of obj1

    obj1.data = 11;
    obj1.next = &obj2;                              //address of obj2

    obj2.data = 21;
    obj2.next = &obj3;                              //address of obj3

    obj3.data = 51;
    obj3.next = NULL;                               //0

    printf("%d\n",head->data);                      //11 we dont use . operator for pointer only -> we use
    printf("%d\n",head->next->data);                //21
    printf("%d\n",head->next->next->data);          //51

    return 0;
}