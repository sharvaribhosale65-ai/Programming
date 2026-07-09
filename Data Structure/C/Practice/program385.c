//Doubly linear linked list

#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
    struct node * prev;                         //$
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;


int main()
{
    printf("%d",sizeof(NODE));                      //20 bytes(4(int data) + 8(next) + 8(prev))

    return 0;
}