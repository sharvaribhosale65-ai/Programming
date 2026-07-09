#include<stdio.h>
#include<stdlib.h>

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
    struct node * newn = NULL;

    newn = (struct node *)malloc(sizeof(struct node));          //memory for single structure
                                                                //malloc(sizeof(struct node) = 12
                                                                //void - (struct node *)

    newn -> data = 11;
    newn -> next = NULL;

    printf("%d\n",newn -> data);                    //11

    return 0;
}