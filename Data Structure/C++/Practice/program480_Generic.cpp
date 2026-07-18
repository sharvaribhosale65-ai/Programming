#include<iostream>
using namespace std;

template <class X>

X maximum(X No1, X No2, X No3)
{

    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3)
    {
        return No2;
    }
    else
    {
        return No3;
    }
}
int main()
{
    cout << maximum(21.5f,11.5f, 18.9f) << "\n";
    cout << maximum(11.8,20.7, 10.8) << "\n";
    cout << maximum(11, 10, 21) << "\n";
    
    return 0;
}