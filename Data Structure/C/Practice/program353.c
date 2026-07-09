#include<stdio.h>

#pragma pack(1)             //remove padding

struct node
{
    int data;
    struct node *next;
};

int main()
{
    struct node obj;

    obj.data = 11;
    obj.next = NULL;

    printf("%d\n",obj.data);       //11 

    return 0;
}