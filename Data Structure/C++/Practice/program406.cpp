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
        PNODE first;                //characteristic(pointer)
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
        this -> first = NULL;    //(this.)in java (self.)in python
        this -> iCount = 0;
    }

void SinglyLL :: Display()          //define all functions
{
    PNODE temp = NULL;

    temp = this -> first;
    while(temp != NULL)             //we use for loop also in cpp
    {
        cout << " | " << temp->data << " | -> ";
        temp = temp -> next;
    }
    cout<<"NULL\n";
}

int SinglyLL :: Count()
{
   return this -> iCount;
}

void SinglyLL :: InsertFirst(int iNo)
{
    PNODE newn = NULL;

    newn = new NODE;

    newn -> data = iNo;
    newn -> next = NULL;

    if(this -> first == NULL)
    {
        this -> first = newn;
    }
    else
    {
        newn -> next = this -> first;
        this -> first = newn;
    }

    this->iCount++;     //important
}

void SinglyLL :: InsertLast(int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = new NODE;

    newn -> data = iNo;
    newn -> next = NULL;

    if(this -> first == NULL)
    {
        this -> first = newn;
    }
    else
    {
        temp = this -> first;

        while(temp -> next != NULL)
        {
            temp = temp -> next;
        }
        temp -> next = newn;
    }

    this->iCount++;     //important
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
    int iRet = 0;

    SinglyLL sObj;

    sObj.Display();

    sObj.InsertFirst(51);
    sObj.InsertFirst(21);
    sObj.InsertFirst(11);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;

    sObj.InsertLast(101);
    sObj.InsertLast(111);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;
    
    return 0;
}