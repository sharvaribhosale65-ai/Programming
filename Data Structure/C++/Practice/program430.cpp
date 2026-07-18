#include<iostream>
using namespace std;

#pragma pack(1)

struct  node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;

class SinglyCL
{
    private :
        PNODE first;
        PNODE last;
        int iCount;

    public :
        SinglyCL();

        void Display();
        int Count();

        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

SinglyCL :: SinglyCL()
{
    this -> first = NULL;
    this -> last = NULL;
    this -> iCount = 0;
}

void SinglyCL :: Display()
{
    PNODE temp = NULL;

    if(this -> first == NULL && this -> last == NULL)
    {
        return;
    }

    temp = this -> first;

    do
    {
        cout << "| " << temp -> data << " | -> ";
        temp = temp -> next;
    } while (this -> last -> next != temp);
    cout << "\n";
    
}

int SinglyCL :: Count()
{
    return this -> iCount;
}

void SinglyCL :: InsertFirst(int iNo)
{
    
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(this -> first == NULL && this -> last == NULL)
    {
        this -> first = newn;
        this -> last = newn;
    }
    else
    {
        newn -> next = this -> first;
        this -> first = newn;
    }  
    this -> last -> next = this -> first;
    this -> iCount++;    
}

void SinglyCL :: InsertLast(int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(this -> first == NULL && this -> last == NULL)
    {
        this -> first = newn;
        this -> last = newn;
    }
    else
    {
        this -> last -> next = newn;
        this -> last = newn;
    } 
    this -> last -> next = this -> first;
    this -> iCount++;
}

void SinglyCL :: InsertAtPos(int iNo, int iPos)
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

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp -> next;
        }
        newn -> next = temp -> next;
        temp -> next = newn;

        this -> iCount++;
    }
}

void SinglyCL :: DeleteFirst()
{
    if(this -> first == NULL && this -> last == NULL)
    {
        return;
    } 
    else if(this -> first == this -> last)
    {
        delete this -> first;
        this -> first = NULL;
        this -> last = NULL;
    }
    else
    {
        this -> first = this -> first -> next;
        delete(this -> last -> next);
    }
    this -> last -> next = this -> first; 
    this -> iCount--;
}

void SinglyCL :: DeleteLast()
{
    PNODE temp = NULL;

    if(this -> first == NULL && this -> last == NULL)
    {
        return;
    } 
    else if(this -> first == this -> last)
    {
        delete this -> first;
        this -> first = NULL;
        this -> last = NULL;
    }
    else
    {
        temp = this -> first;

        while(temp -> next != this -> last)
        {
            temp = temp -> next;
        }
        delete this -> last;
        this -> last = temp;
    }
    this -> last -> next = this -> first; 
    this -> iCount--;
}

void SinglyCL :: DeleteAtPos(int iPos)
{
    PNODE temp = NULL;
    PNODE target = NULL;
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
        target = temp -> next;
        temp -> next = target -> next;
        delete target;

        this -> iCount--;
    }
}
int main()
{
    SinglyCL sObj;
    int iRet = 0;

    sObj.InsertFirst(51);
    sObj.InsertFirst(21);
    sObj.InsertFirst(11);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<<iRet <<endl;

    sObj.InsertLast(101);
    sObj.InsertLast(111);
    sObj.InsertLast(121);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<<iRet <<endl;

    sObj.DeleteFirst();
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<<iRet <<endl;

    sObj.DeleteLast();
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<<iRet <<endl;

    sObj.InsertAtPos(60, 4);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<<iRet <<endl;

    sObj.DeleteAtPos(4);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Number of nodes are : "<<iRet <<endl;

    return 0;
}