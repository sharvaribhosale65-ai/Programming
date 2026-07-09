

#include<stdio.h>
#include<stdlib.h>          //for malloc and free

#define pragma pack(1);

typedef struct Node                 //structure declaration
{
    int data;
    struct Node * next;
}NODE, *PNODE, **PPNODE;

int main()
{
    PNODE head = NULL;

    return 0;
}
