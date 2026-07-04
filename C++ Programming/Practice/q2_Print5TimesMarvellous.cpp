//Print 5 times Marvellous

#include<iostream>
using namespace std;

void PrintMarvellous(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        cout << "Marvellous\n";
    }
}

int main()
{
    int iValue = 5;

    PrintMarvellous(iValue);

    return 0;
}

/*
Input   :   5

Output  :   Marvellous
            Marvellous
            Marvellous
            Marvellous
            Marvellous
*/