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

void Display(PNODE first)
{

}

int Count(PNODE first)
{
    return 0;
}

void InsertFirst(PPNODE first, int iNo)
{

}

void InsertLast(PPNODE first, int iNo)
{

}

void InsertAtPos(PPNODE first, int iNo, int iPos)
{

}

void DeleteFirst(PPNODE first)
{

}

void DeleteLast(PPNODE first)
{

}

void DeleteAtPos(PPNODE first, int iPos)
{

}



int main()
{
    PNODE head = NULL;


    return 0;
}