#include<iostream>
using namespace std;

#pragma pack(1)

template <class T>

struct node
{
    T data;
    struct node * next;
};

template <class T>

class Stack
{
    private:
        struct node<T> * first;         //<T> - generic
        int iCount;
    
    public:
        Stack();                    //Parameterized constructor
        void Push(T iNo);         //InsertFirst
        T Pop();                  //DeleteFirst
        T Peep();                 //DeleteFirst()
        void Display();
        int Count();
};

template <class T>

Stack<T> :: Stack() 
{
    first = NULL;
    iCount = 0;
} 

template <class T>
void Stack<T> :: Push(T iNo) 
{
    struct node<T> * newn = NULL;

    newn = new struct node<T>();

    newn -> data = iNo;
    newn -> next = NULL;

    newn -> next = this -> first;
    this -> first = newn;
    
    iCount++;
}   

template <class T>
T Stack<T> :: Pop()  
{
    T iValue = 0;
    struct node<T> * temp = NULL;

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

template <class T>
T Stack<T> :: Peep() 
{
    T iValue = 0;

    if(first == NULL)
    {
        cout << "Stack is empty";
        return -1;
    }
    else
    {
        iValue = first -> data;
        return iValue;
    }
}  

template <class T>
void Stack<T> :: Display()
{
    struct node<T> * temp = NULL;

    temp = first;

    while(temp != NULL)
    {
        cout << " | " << temp->data << " |\n";
        temp = temp->next;
    }
    cout << "\n";
} 

template <class T>
int Stack<T> :: Count()
{
    return iCount;
} 

int main()
{
    Stack<int> sObj;                     //Stack class object

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

    iRet = sObj.Peep();
    cout << "Peeped element is : " << iRet << "\n";
    sObj.Display();
    iRet = sObj.Count();
    cout << "Elements of stack are : " << iRet << "\n";

    return 0;
}