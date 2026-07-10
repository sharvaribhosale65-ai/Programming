//doubly

#include<iostream>
using namespace std;

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
    struct node * prev;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

class DoublyLL
{
    private:
        PNODE first;                //characteristic(pointer)
        int iCount;                 //characteristic

    public:
        DoublyLL();                 //default constructor(function declaration)

        void Display();             //declare all functions
        int Count();
        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

DoublyLL :: DoublyLL()       //SinglyLL - class name           
    {
        this -> first = NULL;    //(this.)in java (self.)in python
        this -> iCount = 0;
    }

void DoublyLL :: Display()          //define all functions
{
    PNODE temp = NULL;

    temp = this -> first;

    while(temp != NULL)
    {
        cout << " | " << temp -> data << " | -> ";
        temp = temp -> next;
    }
    cout << "NULL\n";
}

int DoublyLL :: Count()
{
   return this -> iCount;
}

void DoublyLL :: InsertFirst(int iNo)
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
        this -> first -> prev = newn;
        this -> first = newn;
    }
    this -> iCount++;
}

void DoublyLL :: InsertLast(int iNo)
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
        newn -> prev = temp;
    }
    this -> iCount++;
}

void DoublyLL :: InsertAtPos(int iNo, int iPos)
{
    PNODE newn = NULL;
    PNODE temp = NULL;
    int i = 0;

    if(iPos < 1 || iPos > iCount+1)
    {
        cout << "Invalid position\n";
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(iNo);
    }
    else if(iPos == iCount+1)
    {
        InsertLast(iNo);
    }
    else
    {
        newn = new NODE;

        newn -> data = iNo;
        newn -> next = NULL;

        temp = this -> first;

        for(i = 1; i < iPos -1; i++)
        {
            temp = temp -> next;
        }
        newn -> next = temp -> next;
        temp -> next -> prev = newn;
        newn -> prev = temp;
        temp -> next = newn;

        this -> iCount++;
    }
    
}

void DoublyLL :: DeleteFirst()
{
    
    if(this -> first == NULL)
    {
        return;
    }
    else if(this -> first -> next == NULL)
    {
        delete this -> first;
        this -> first = NULL;
    }
    else
    {
        this -> first = this -> first -> next;
        delete this -> first -> prev;
        this -> first -> prev = NULL;
    }
    this -> iCount--;
}

void DoublyLL :: DeleteLast()
{
    PNODE temp = NULL;

    if(this -> first == NULL)
    {
        return;
    }
    else if(this -> first -> next == NULL)
    {
        delete this -> first;
        this -> first = NULL;
    }
    else
    {
        temp = this -> first;

        while(temp -> next -> next != NULL)
        {
            temp = temp -> next;
        }
        delete temp -> next;
        temp -> next = NULL;
    }
    this -> iCount--;
}

void DoublyLL :: DeleteAtPos(int iPos)
{
    PNODE newn = NULL;
    PNODE temp = NULL;
    int i = 0;

    if(iPos < 1 || iPos > iCount)
    {
        cout << "Invalid position\n";
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst();
    }
    else if(iPos == iCount)
    {
        DeleteLast();
    }
    else
    {
        temp = this -> first;
        for(i = 1; i < iPos-1; i++)
        {
            temp = temp -> next;
        }
        temp -> next = temp -> next -> next;
        delete temp -> next -> prev;
        temp -> next -> prev = temp;
        this -> iCount--;
    }
}

int main()
{
    int iRet = 0;

    DoublyLL dObj;

    dObj.Display();

    dObj.InsertFirst(51);
    dObj.InsertFirst(21);
    dObj.InsertFirst(11);
    dObj.Display();
    iRet = dObj.Count();
    cout << "Number of nodes are : " << iRet << endl;

    dObj.InsertLast(101);
    dObj.InsertLast(111);
    dObj.Display();
    iRet = dObj.Count();
    cout << "Number of nodes are : " << iRet << endl;

    dObj.DeleteFirst();
    dObj.Display();
    iRet = dObj.Count();
    cout << "Number of nodes are : " << iRet << endl;

    dObj.DeleteLast();
    dObj.Display();
    iRet = dObj.Count();
    cout << "Number of nodes are : " << iRet << endl;

    dObj.InsertAtPos(90,3);
    dObj.InsertAtPos(100,4);
    dObj.Display();
    iRet = dObj.Count();
    cout << "Number of nodes are : " << iRet << endl;

    dObj.DeleteAtPos(3);
    dObj.Display();
    iRet = dObj.Count();
    cout << "Number of nodes are : " << iRet << endl;

    return 0;
}