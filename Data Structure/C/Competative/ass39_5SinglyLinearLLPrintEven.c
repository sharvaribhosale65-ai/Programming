/*
Algorithm:
    START
        Traverse the linked list.
        Check each node for an even number.
        Display all even numbers.
    STOP
*/

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : Display
// Input         : PNODE
// Output        : void
// Description   : Display all elements of the linked list.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf(" | %d | -> ",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : InsertLast
// Input         : PPNODE, int
// Output        : void
// Description   : Insert a new node at the end of the linked list.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    temp = *first;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : DisplayEven
// Input         : PNODE
// Output        : void
// Description   : Display all even elements from the linked list.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

void DisplayEven(PNODE first)
{
    printf("Even numbers are : ");

    while(first != NULL)
    {
        if(first->data % 2 == 0)
        {
            printf("%d\t", first->data);
        }
        first = first->next;
    }
}

int main()
{
    PNODE head = NULL;

    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,22);
    InsertLast(&head,51);
    InsertLast(&head,101);
    InsertLast(&head,111);

    Display(head);

    DisplayEven(head);

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////
//
// Output : | 11 | -> | 21 | -> | 22 | -> | 51 | -> | 101 | -> | 111 | -> NULL
//          Even numbers are : 22
//
/////////////////////////////////////////////////////////////////////////////////