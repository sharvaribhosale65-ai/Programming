#include<stdio.h>

#pragma pack(1)                     //remove padding

struct node
{
    int data;                       //4byte
    struct node *next;              //8byte
};


int main()
{
    struct node obj1, obj2;

    obj1.data = 11;
    obj1.next = &obj2;              //address of obj2

    obj2.data = 21;
    obj2.next = NULL;

    printf("%d\n",obj1.data);       //11 
    printf("%d\n",obj2.data);       //21

    return 0;
}