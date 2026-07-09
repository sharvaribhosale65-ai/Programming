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

    printf("%u\n",&obj1);               //display address of obj1
    printf("%u\n",&obj2);               //display address of obj2
    printf("%u\n",obj1.next);           //display address of obj1
    printf("%u\n",obj2.next);           //display address of obj2
    printf("%d\n",obj1.next -> data);   //display data of obj2

                                        //getting all adreesses are virtual
    return 0;
}