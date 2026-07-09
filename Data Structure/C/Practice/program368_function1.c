/*
#include<stdio.h>
#include<stdlib.h>          //for malloc and free

#define pragma pack(1);

struct Node                 //structure declaration
{
    int data;
    struct Node * next;
};

typedef struct Node NODE;
typedef struct Node *  PNODE;
typedef struct Node ** PPNODE;

int main()
{
    PNODE head = NULL;


    return 0;
}
*/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

int main()
{
    PNODE head = NULL;

    return 0;
}