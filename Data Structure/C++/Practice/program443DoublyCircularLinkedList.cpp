#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node * next;
    struct  node * prev;
    
};

typedef struct node  NODE;
typedef struct node * PNODE;

#pragma pack(1)
class DoublyCl
{
    private :
        PNODE first;
        PNODE last;
        int iCount;

    public :
        DoublyCl();

        void Display();
        int Count();

        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

DoublyCl ::  DoublyCl()
{
    cout << "Inside constructor";
    this -> first = NULL;
    this -> last = NULL;
    this -> iCount = 0;
}

void DoublyCl :: Display()
{

}
int DoublyCl :: Count()
{
    return 0;
}

void DoublyCl :: InsertFirst(int iNo)
{
    PNODE newn = NULL;

    newn = new NODE;

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
        first -> prev = newn;
        first = newn;
    }
}
void DoublyCl :: InsertLast(int iNo)
{

}
void DoublyCl :: InsertAtPos(int iNo, int iPos)
{

}
void DoublyCl :: DeleteFirst()
{

}
void DoublyCl :: DeleteLast()
{

}
void DoublyCl :: DeleteAtPos(int iPos)
{

}

int main()
{
    DoublyCl dObj;

    dObj.InsertFirst(51);
    dObj.InsertFirst(21);
    dObj.InsertFirst(11);

    return 0;
}