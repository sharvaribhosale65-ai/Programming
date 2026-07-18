#include<iostream>
using namespace std;

int maximum(int No1, int No2)
{
    if(No1 > No2)
    {
        return No1;
    }
    else
    {
        return No2;
    }
}
int main()
{
    cout << maximum(11, 10) << "\n";
    
    return 0;
}