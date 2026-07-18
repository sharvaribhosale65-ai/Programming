#include<iostream>
using namespace std;

float maximum(float No1, float No2)
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
    cout << maximum(11.8, 10.8) << "\n";
    
    return 0;
}