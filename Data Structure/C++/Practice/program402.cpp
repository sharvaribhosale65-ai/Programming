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

class SinglyLL
{
    private:                        //abstraction(hiding something)
        PNODE fisrt;                //characteristic
        int iCount;                 //characteristic

    public:
        SinglyLL()                  //default constructor
        {
            cout << "Inside constructor";
            this -> fisrt = NULL;    //(this.)in java (self.)in python
            this -> iCount = 0;
        }

        void Display()
        {

        }

        int Count()
        {
            return this -> iCount;
        }

        void InsertFirst(int iNo)
        {

        }

        void InsertLast(int iNo)
        {

        }

        void InsertAtPos(int iNo, int iPos)
        {

        }

        void DeleteFirst()
        {

        }

        void DeleteLast()
        {

        }

        void DeleteAtPos(int iPos)
        {

        }
};

int main()
{
    SinglyLL sObj;
    
    return 0;
}