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

};

int main()
{
    DoublyCl dObj;

    cout << sizeof(dObj);

    return 0;
}