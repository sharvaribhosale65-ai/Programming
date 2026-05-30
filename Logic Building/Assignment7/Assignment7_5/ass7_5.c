/*
Algorithm:

    START
        Accept number as iNo
        Perform difference between even factorial and odd factorial
        Display the result
    STOP
*/

/////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

/////////////////////////////////////////////////////////////////////////////
//
// Function name    :   FactorialDiff
// Input    :           int
// Output   :           int
// Description  :       Perform difference between even factorial and odd factorial
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iEven = 1;
    int iOdd = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iEven = iEven * iCnt;
        }
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 != 0)
        {
            iOdd = iOdd * iCnt;
        }
    }

    return iEven - iOdd;
}

/////////////////////////////////////////////////////////////////
//
// Application to perform difference between even factorial and odd factorial of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("The difference of even and odd factorial is %d", iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input    :   10
// Output   :   The difference of even and odd factorial is 2895
// Input    :   -5
// Output   :   The difference of even and odd factorial is -7
//
/////////////////////////////////////////////////////////////////