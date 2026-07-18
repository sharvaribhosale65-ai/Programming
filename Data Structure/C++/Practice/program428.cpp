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
        PNODE iCount;

    public :
        SinglyCL();
};

SinglyCL :: SinglyCL()
{
    cout << "Inside constructor\n";
    this -> first = NULL;
    this -> last = NULL;
    this -> iCount = 0;
}
int main()
{
    SinglyCL sObj;

    return 0;
}