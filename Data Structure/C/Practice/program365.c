#include<stdio.h>

#pragma pack(1)                                     //remove padding

struct node
{
    int data;                                       //4byte
    struct node *next;                              //8byte
};

typedef struct node NODE;
typedef struct node * PNODE;

int Count(PNODE first)                              //first - call by value
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first -> next; 
    }
    return iCount;
}

int main()
{
    PNODE head = NULL;                              //pointer(0) 

    int iRet = 0;

    NODE obj1, obj2, obj3;                          //declaration

    head = &obj1;                                   //address of obj1(100)

    obj1.data = 11;
    obj1.next = &obj2;                              //address of obj2(200)

    obj2.data = 21;
    obj2.next = &obj3;                              //address of obj3(300)

    obj3.data = 51;
    obj3.next = NULL;                               //0

    iRet = Count(head);                             //100(data)

    printf("Number of nodes are : %d\n",iRet);      //3

    return 0;
}