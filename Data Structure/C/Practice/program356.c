#include<stdio.h>

#pragma pack(1)                         //remove padding

struct node
{
    int data;                           //4byte
    struct node *next;                  //8byte
};


int main()
{
    struct node obj1, obj2, obj3;

    obj1.data = 11;
    obj1.next = &obj2;                              //address of obj2

    obj2.data = 21;
    obj2.next = &obj3;                              //address of obj3

    obj3.data = 51;
    obj3.next = NULL;                               //0

    printf("%u\n",&obj1);                           //display address of obj1
    printf("%u\n",&obj2);                           //display address of obj2
    printf("%u\n",&obj3);                           //display address of obj3

    printf("%u\n",obj1.next);                       //display address of obj1
    printf("%u\n",obj2.next);                       //display address of obj2
    printf("%u\n",obj3.next);                       //display address of obj3

    printf("%d\n",obj1.data);                       //display data of obj1
    printf("%d\n",obj1.next -> data);               //display data of obj2
    printf("%d\n",obj1.next->next->data);       //display data of obj3

    return 0;
}