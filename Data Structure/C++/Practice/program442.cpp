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
    
}

void DoublyCl :: Display()
{

}
int DoublyCl :: Count()
{
    return iCount;
}

void DoublyCl :: InsertFirst(int iNo)
{

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

    cout << sizeof(dObj);

    return 0;
}