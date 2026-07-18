#include<iostream>
using namespace std;

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
};

class Stack
{
    private:
        struct node * first;
        int iCount;
    
    public:
        Stack();                    //Parameterized constructor
        void Push(int iNo);         //InsertFirst
        int Pop();                  //DeleteFirst
        int Peep();                 //DeleteFirst()
        void Display();
        int Count();
};

Stack :: Stack() 
{
    this->first = NULL;
    this->iCount = 0;
} 

void Stack :: Push(int iNo) 
{
    struct node * newn = NULL;

    newn = new struct node();

    newn -> data = iNo;
    newn -> next = NULL;

    newn -> next = this -> first;
    this -> first = newn;
    
    iCount++;
}        
int Stack :: Pop()  
{
    int iValue = 0;
    struct node * temp = NULL;

    if(first == NULL)
    {
        cout << "Stack is empty";
        return -1;
    }
    else
    {
        iValue = first -> data;
        temp = first;

        first = first -> next;
        delete temp;

        iCount--;
        return iValue;
    }
}        
int Stack :: Peep() 
{
    return 0;
}  


void Stack :: Display()
{
    struct node * temp = NULL;

    temp = first;

    while(temp != NULL)
    {
        cout << " | " << temp->data << " |\n";
        temp = temp->next;
    }
    cout << "\n";
} 
int Stack :: Count()
{
    return iCount;
} 

int main()
{
    Stack sObj;                     //Stack class object

    int iRet = 0;

    sObj.Push(11);
    sObj.Push(21);
    sObj.Push(51);
    sObj.Push(101);
    sObj.Display();
    iRet = sObj.Count();
    cout << "Elements of stack are : " << iRet << "\n";

    iRet = sObj.Pop();
    cout << "Poped element is : " << iRet << "\n";
    sObj.Display();
    iRet = sObj.Count();
    cout << "Elements of stack are : " << iRet << "\n";

    return 0;
}