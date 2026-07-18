#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
};

void Display(struct node * first, struct node * last)               
{
    if(first == NULL && last == NULL)           
    {
        return;
    }
    do
    {
        printf("| %d | -> ", first -> data);
        first = first -> next;
    } while(first != last -> next);
    printf("\n");
}

int Count(struct node * first, struct node * last)
{
    int iCount = 0;

    if(first == NULL && last == NULL)               //filter          
    {
        return iCount;
    }

    do
    {
        iCount++;
        first = first -> next;
    } while(first != last -> next);
    
    return iCount;
}

void InsertFirst(struct node ** first, struct node ** last, int iNo)
{
    struct node * newn = NULL;

    newn = (struct node *)malloc(sizeof(struct node));

    newn -> data = iNo;
    newn -> next = NULL;

    if(*first == NULL && *last == NULL)
    {
        *first = newn;
        *last = newn;
    }
    else
    {
        newn -> next = *first;
        *first = newn;
    }
    (*last) -> next = *first;       

}

void InsertLast(struct node ** first, struct node ** last, int iNo)
{
    struct node * newn = NULL;

    newn = (struct node *)malloc(sizeof(struct node));

    newn -> data = iNo;
    newn -> next = NULL;

    if(*first == NULL && *last == NULL)
    {
        *first = newn;
        *last = newn;
    }
    else
    {
        (*last) -> next = newn;
        *last = (*last) -> next;        //we also write *last = newn;
    }
    (*last) -> next = *first;
}

void InsertAtPosition(struct node ** first, struct node ** last, int iNo, int iPos)
{
    struct node * temp = NULL;
    struct node * newn = NULL;
    int iCount = 0,i = 0;

    iCount = Count(*first,*last);

    if(iPos < 1 || iPos > iCount+1)
    {
        printf("Invalid position");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,last,iNo);
    }

    else if(iPos == iCount+1)
    {
        InsertLast(first,last,iNo);
    }

    else
    {
        temp = *first;

        newn = (struct node *)malloc(sizeof(struct node));

        newn -> data = iNo;
        newn -> next = NULL;

        for(i = 1; i < iPos -1; i++)
        {
            temp = temp -> next;
        }
        newn -> next = temp -> next;
        temp -> next = newn;
    }
}

void DeleteFirst(struct node ** first, struct node ** last)
{
    if(*first == NULL && *last == NULL)
    {
        return;
    }
    else if((*first) == (*last))
    {
        free(*first);
        *first = NULL;
        *last =  NULL;
    }
    else
    {
        *first = (*first) -> next;
        free((*last) -> next);              
       
       (*last) -> next = *first;
    }
}

void DeleteLast(struct node ** first, struct node ** last)
{
    struct node * temp = NULL;

    if(*first == NULL && *last == NULL)
    {
        return;
    }
    else if((*first) == (*last))
    {
        free(*first);
        *first = NULL;
        *last =  NULL;
    }
    else
    {
        temp = *first;

        while(temp -> next != *last)
        {
            temp = temp -> next;
        }
        free(*last);
        *last = temp;
        (*last) -> next = *first;
    }
}

void DeleteAtPosition(struct node ** first, struct node ** last, int iPos)
{
    struct node * temp = NULL;
    struct node * target = NULL;

    int iCount = 0,i = 0;

    iCount = Count(*first,*last);

    if(iPos < 1 || iPos > iCount)
    {
        printf("Invalid position");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first,last);
    }

    else if(iPos == iCount)
    {
        DeleteLast(first,last);
    }

    else
    {
        temp = *first;

        for(i = 1; i < iPos -1; i++)
        {
            temp = temp -> next;
        }
        target = temp -> next;
        temp -> next = target -> next;
        free(target);
    }
}

int main()
{
    struct node * head = NULL;
    struct node * tail = NULL;

    int iRet = 0;

    InsertFirst(&head,&tail,51);
    InsertFirst(&head,&tail,21);
    InsertFirst(&head,&tail,11);

    InsertLast(&head,&tail,101);
    InsertLast(&head,&tail,111);
    InsertLast(&head,&tail,151);

    Display(head,tail);
    iRet = Count(head, tail);
    printf("Number of nodes are : %d\n",iRet);

    DeleteFirst(&head,&tail);
    Display(head,tail);
    iRet = Count(head, tail);
    printf("Number of nodes are : %d\n",iRet);

    DeleteLast(&head,&tail);
    Display(head,tail);
    iRet = Count(head, tail);
    printf("Number of nodes are : %d\n",iRet);

    InsertAtPosition(&head,&tail,105,4);
    Display(head,tail);
    iRet = Count(head, tail);
    printf("Number of nodes are : %d\n",iRet);

    DeleteAtPosition(&head,&tail,4);
    Display(head,tail);
    iRet = Count(head, tail);
    printf("Number of nodes are : %d\n",iRet);

    return 0;
}