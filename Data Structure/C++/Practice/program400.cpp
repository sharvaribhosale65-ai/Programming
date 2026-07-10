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
    public:
        PNODE fisrt;                //characteristic
        int iCount;                 //characteristic

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

    sObj.fisrt = NULL;   //Drawback       //it removes pointer beacause we use public in class
    sObj.iCount = 15;    //Drawback
    
    return 0;
}