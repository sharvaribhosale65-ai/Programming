/*
Algorithm:
    START
        Traverse the linked list.
        Compare each node with the given number.
        Count all elements less than the given number.
        Return the count.
    STOP
*/

#include<stdio.h>
#include<stdlib.h>

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
        printf("| %d | -> ",first->data);
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

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : CountLess
// Input         : PNODE, int
// Output        : int
// Description   : Count the number of elements less than the given value.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int CountLess(PNODE first, int iNo)
{
    int iCount = 0;

    while(first != NULL)
    {
        if(first->data < iNo)
        {
            iCount++;
        }

        first = first->next;
    }

    return iCount;
}

int main()
{
    PNODE head = NULL;
    int iValue = 0;
    int iRet = 0;

    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,11);
    InsertLast(&head,101);
    InsertLast(&head,111);

    Display(head);

    printf("Enter the number you want : ");
    scanf("%d",&iValue);

    iRet = CountLess(head,iValue);

    printf("Count of elements which is less than %d is : %d",iValue,iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////
//
// Input  : 35
// Output : | 11 | -> | 21 | -> | 11 | -> | 101 | -> | 111 | -> NULL
//          Enter the number you want : 35
//          Count of elements which is less than 35 is : 3
//
/////////////////////////////////////////////////////////////////////////////////