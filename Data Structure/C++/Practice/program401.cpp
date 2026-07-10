#include<iostream>
using namespace std;

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

class SinglyLL
{
    private:
        PNODE fisrt;                //characteristic
        int iCount;                 //characteristic

    public:
        SinglyLL()                  //default constructor
        {
            cout << "Inside constructor";
            this -> fisrt = NULL;    //(this.)in java (self.)in python
            this -> iCount = 0;
        }
};

int main()
{
    SinglyLL sObj;

    sObj.fisrt = NULL;   //error       
    sObj.iCount = 15;    //error
    
    return 0;
}