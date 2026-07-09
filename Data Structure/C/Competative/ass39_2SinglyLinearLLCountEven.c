/*
Algorithm:
    START
        Create a linked list.
        Insert nodes at the end of the linked list.
        Display all elements of the linked list.
        Traverse the linked list.
        Check whether each node contains an even number.
        Increment the counter for every even number found.
        Return the count of even numbers.
        Display the count.
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
// Author        : Sharvari Bhosale
// Date          :
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
// Author        : Sharvari Bhosale
// Date          :
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
// Function name : CountEven
// Input         : PNODE
// Output        : int
// Description   : Count the total number of even elements in the linked list.
// Author        : Sharvari Bhosale
// Date          :
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int CountEven(PNODE first)
{
    int iCount = 0;

    while(first != NULL)
    {
        if(first->data % 2 == 0)
        {
            iCount++;
        }
        first = first->next;
    }

    return iCount;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : main
// Description   : Entry point of the application.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    PNODE head = NULL;

    int iRet = 0;

    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,22);
    InsertLast(&head,51);
    InsertLast(&head,101);
    InsertLast(&head,111);

    Display(head);

    iRet = CountEven(head);
    printf("Count of even numbers are : %d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////
//
// Output : | 11 | -> | 21 | -> | 22 | -> | 51 | -> | 101 | -> | 111 | -> NULL
//          Count of even numbers are : 1
//
/////////////////////////////////////////////////////////////////////////////////