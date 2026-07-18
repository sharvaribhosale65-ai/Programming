#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

void Display(struct node * first)
{
    struct node * temp = NULL;

    temp = first;

    while(temp != NULL)
    {
        printf("| %d | -> ",temp -> data);
        temp = temp -> next;
    }
    printf("NULL\n");
}

int Count(struct node * first)
{
    struct node * temp = NULL;

    temp = first;

    int iCount = 0;

    while(temp != NULL)
    {
        iCount++;
        temp = temp -> next;
    }
    return iCount;
}

void InsertFirst(struct node ** first, int iNo)
{
    struct node * newn = NULL;

    newn = (struct node *)malloc(sizeof(struct node));

    newn -> data = iNo;
    newn -> next = NULL;
    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn -> next = *first;
        *first = newn;
    }
}

void InsertLast(struct node ** first, int iNo)
{
    struct node * newn = NULL;
    struct node * temp = NULL;

    newn = (struct node *)malloc(sizeof(struct node));

    newn -> data = iNo;
    newn -> next = NULL;
    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp -> next != NULL)
        {
            temp = temp -> next;
        }
        temp -> next = newn;
    }
}

void InsertAtPos(struct node ** first, int iNo, int iPos)
{
    int iCount = 0;
    int i = 0;

    struct node * newn = NULL;
    struct node * temp = NULL;

    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount+1))
    {
        printf("Invalid position\n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,iNo);
    }
    else if(iPos == iCount+1)
    {
        InsertLast(first,iNo);
    }
    else
    {
        newn = (struct node *)malloc(sizeof(struct node));

        newn->data = iNo;
        newn->next = NULL;

        temp = *first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;
    }
}

void DeleteFirst(struct node ** first)
{
    struct node * temp = NULL;

    if(*first == NULL)                  // LL is empty
    {
        return;
    }
    else if((*first) -> next == NULL)      // LL contains 1 node
    {
        free(*first);
        *first = NULL;
    }
    else                                // LL contains more than 1 node
    {
        temp = *first;

        *first = (*first) -> next;
        free(temp);
    }
}

void DeleteLast(struct node ** first)
{
    struct node * temp = NULL;

    if(*first == NULL)                  // LL is empty
    {
        return;
    }
    else if((*first) -> next == NULL)      // LL contains 1 node
    {
        free(*first);
        *first = NULL;
    }
    else                                // LL contains more than 1 node
    {
        temp = *first;

        while(temp -> next -> next != NULL)  // Type 3
        {
            temp = temp -> next;
        }

        free(temp->next);
        temp->next = NULL;
    }
}

void DeleteAtPos(struct node ** first, int iPos)
{
    int iCount = 0;
    int i = 0;

    struct node * temp = NULL;
    struct node * target = NULL;

    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid position\n");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first);
    }
    else if(iPos == iCount)
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp -> next;
        }

        target = temp->next;

        temp->next = target->next;
        free(target);
    }
}

int main()
{

    struct node * head = NULL;
    int iRet = 0;

    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    InsertLast(&head,101);
    InsertLast(&head,111);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteFirst(&head);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteLast(&head);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    InsertAtPos(&head, 61, 3);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteAtPos(&head, 3);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    return 0;
}