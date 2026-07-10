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
        this -> first = NULL;     //this means non static character
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
    int i = 0;

    if(iPos < 1 || iPos > iCount + 1)
    {
        cout << "Invalid position\n";
        return;
    }

    PNODE temp = NULL;
    PNODE newn = NULL;

    newn = new NODE;

    newn -> data = iNo;
    newn -> next = NULL;

    if(iPos == 1)
    {
        this -> InsertFirst(iNo);       //this -> internally call class
    }

    else if(iPos == iCount+1)
    {
        this -> InsertLast(iNo);
    }
    else
    {
        temp = this -> first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp -> next;
        }
        newn -> next = temp -> next;
        temp -> next = newn;

        this -> iCount++;
    }
}

void SinglyLL :: DeleteFirst()
{
    PNODE temp = NULL;

    if(this -> first == NULL)
    {
        return;
    }
    else if(this -> first -> next == NULL)
    {
        delete(this -> first);
        this -> first = NULL;
    }
    else
    {
        temp = this -> first;

        this -> first = this -> first -> next;

        delete temp;

    }
    this->iCount--;
}

void SinglyLL :: DeleteLast()
{
    PNODE temp = NULL;
    PNODE target = NULL;

    if(this -> first == NULL)
    {
        return;
    }
    else if(this -> first -> next == NULL)
    {
        delete(this -> first -> next);
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

void SinglyLL :: DeleteAtPos(int iPos)
{
    int i = 0;

    if(iPos < 1 || iPos > iCount)
    {
        cout << "Invalid position\n";
        return;
    }

    PNODE temp = NULL;
    PNODE target = NULL;

    if(iPos == 1)
    {
        this -> DeleteFirst();       
    }

    else if(iPos == iCount)
    {
        this -> DeleteLast();
    }
    else
    {
        temp = this -> first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp -> next;
        }
        
        target = temp -> next;
        temp -> next = target -> next;
        delete target;
        
        this -> iCount--;
    }
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

    sObj.InsertLast(105);
    sObj.InsertLast(111);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;

    sObj.DeleteFirst();
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;

    sObj.DeleteLast();
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;

    sObj.InsertAtPos(124,3);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;

    sObj.DeleteAtPos(3);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<< iRet << endl;
    
    return 0;
}