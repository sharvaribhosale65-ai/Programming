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
        PNODE fisrt;        //characteristic
        int iCount;         //characteristic

        SinglyLL()              //default constructor
        {
            cout << "Inside constructor";
            this -> fisrt = NULL;    //(this.)in java (self.)in python
            this -> iCount = 0;
        }
};

int main()
{
    SinglyLL sObj;

    cout << sObj.fisrt << endl;
    cout << sObj.iCount << endl;
    return 0;
}