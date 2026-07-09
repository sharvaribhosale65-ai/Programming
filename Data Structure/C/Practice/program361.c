#include<stdio.h>

#pragma pack(1)                                     //remove padding

struct node
{
    int data;                                       //4byte
    struct node *next;                              //8byte
};

typedef struct node NODE;
typedef struct node * PNODE;

int main()
{
    PNODE head = NULL;                              //pointer(0)
    PNODE temp = NULL;                              //temporary pointer(0)       

    NODE obj1, obj2, obj3;                          //declaration

    head = &obj1;                                   //address of obj1(100)

    obj1.data = 11;
    obj1.next = &obj2;                              //address of obj2(200)

    obj2.data = 21;
    obj2.next = &obj3;                              //address of obj3(300)

    obj3.data = 51;
    obj3.next = NULL;                               //0

    temp = head;                                    //initialize temporary pointer(100)

    //sequence
    
    printf("%d\n",temp->data);                      //11

    temp = temp -> next;                            //temp = 200
    printf("%d\n",temp->data);                      //21

    temp = temp -> next;                            //temp = 300
    printf("%d\n",temp->data);                      //51

    temp = temp -> next;                            //Null(0)

    return 0;
}