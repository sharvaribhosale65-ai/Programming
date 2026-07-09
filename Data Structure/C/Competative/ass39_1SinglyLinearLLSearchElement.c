/*
Algorithm:
    START
        Create a linked list.
        Accept a number from the user.
        Traverse the linked list.
        Compare each node data with the given number.
        If number is found, return true.
        Otherwise return false.
        Display the appropriate message.
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
        printf(" | %d | -> ",first -> data);
        first = first -> next;
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
// Function name : Search
// Input         : PNODE, int
// Output        : bool
// Description   : Search the given element in the linked list.
// Author        : Sharvari Bhosale
// Date          :
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

bool Search(PNODE first, int iNo)
{
    while(first != NULL)
    {
        if(first->data == iNo)
        {
            return true;
        }
        first = first->next;
    }

    return false;
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

    int iValue = 0;
    bool bRet = false;

    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,51);
    InsertLast(&head,101);
    InsertLast(&head,111);

    Display(head);

    printf("Enter the number you want : \n");
    scanf("%d",&iValue);

    bRet = Search(head,iValue);

    if(bRet == true)
    {
        printf("Number is present");
    }
    else
    {
        printf("Number is absent");
    }

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////
//
// Input  : 51
// Output : | 11 | -> | 21 | -> | 51 | -> | 101 | -> | 111 | -> NULL
//          Enter the number you want :
//          51
//          Number is present
//
// Input  : 25
// Output : | 11 | -> | 21 | -> | 51 | -> | 101 | -> | 111 | -> NULL
//          Enter the number you want :
//          25
//          Number is absent
//
/////////////////////////////////////////////////////////////////////////////////