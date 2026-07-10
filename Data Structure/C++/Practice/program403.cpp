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
        SinglyLL();                 //default constructor(function declaration)

        void Display();             //declare all functions
        int Count();
        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

SinglyLL :: SinglyLL()       //SinglyLL - class name           
    {
        cout << "Inside constructor";
        this -> fisrt = NULL;    //(this.)in java (self.)in python
        this -> iCount = 0;
    }

void SinglyLL :: Display()          //define all functions
{

}

int SinglyLL :: Count()
{
   return this -> iCount;
}

void SinglyLL :: InsertFirst(int iNo)
{

}

void SinglyLL :: InsertLast(int iNo)
{

}

void SinglyLL :: InsertAtPos(int iNo, int iPos)
{

}

void SinglyLL :: DeleteFirst()
{

}

void SinglyLL :: DeleteLast()
{

}

void SinglyLL :: DeleteAtPos(int iPos)
{

}

int main()
{
    SinglyLL sObj;
    
    return 0;
}