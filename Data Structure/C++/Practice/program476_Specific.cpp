#include<iostream>
using namespace std;

float maximum(float No1, float No2)
{
    float Ans;

    if(No1 > No2)
    {
        Ans = No1;
    }
    else
    {
        Ans = No2;
    }
}
int main()
{
    cout << maximum(11.8, 10.8) << "\n";
    
    return 0;
}