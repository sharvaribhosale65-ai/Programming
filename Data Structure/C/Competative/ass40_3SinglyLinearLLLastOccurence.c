/*
Algorithm:
    START
        Traverse the linked list.
        Compare each node with the given number.
        Store the position whenever the number is found.
        Return the last stored position.
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
// Function name : LastOccurence
// Input         : PNODE, int
// Output        : int
// Description   : Return the position of the last occurrence of the given element.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int LastOccurence(PNODE first, int iNo)
{
    int iPos = 1;
    int iLast = -1;

    while(first != NULL)
    {
        if(first->data == iNo)
        {
            iLast = iPos;
        }

        iPos++;
        first = first->next;
    }

    return iLast;
}

int main()
{
    PNODE head = NULL;

    int iValue = 0;
    int iRet = 0;

    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,22);
    InsertLast(&head,11);
    InsertLast(&head,101);
    InsertLast(&head,111);

    Display(head);

    printf("Enter the number you want : ");
    scanf("%d",&iValue);

    iRet = LastOccurence(head,iValue);

    if(iRet == -1)
    {
        printf("Invalid number\n");
    }
    else
    {
        printf("Last occurence of %d at position : %d",iValue,iRet);
    }

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////
//
// Input  : 11
// Output : | 11 | -> | 21 | -> | 22 | -> | 11 | -> | 101 | -> | 111 | -> NULL
//          Enter the number you want : 11
//          Last occurence of 11 at position : 4
//
// Input  : 32
// Output : | 11 | -> | 21 | -> | 22 | -> | 11 | -> | 101 | -> | 111 | -> NULL
//          Enter the number you want : 32
//          Invalid number
//
/////////////////////////////////////////////////////////////////////////////////