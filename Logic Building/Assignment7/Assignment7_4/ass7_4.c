/*
Algorithm:

    START
        Accept number as iNo
        Find odd factorial of number
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
// Function name    :   OddFactorial
// Input    :           int
// Output   :           int
// Description  :       Find odd factorial of number
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int OddFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 != 0)
        {
            iFact = iFact * iCnt;
        }
    }
    return iFact;
}

/////////////////////////////////////////////////////////////////
//
// Application to find odd factorial of number of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = OddFactorial(iValue);

    printf("Odd factorial of number is %d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  10
// Output : Odd factorial of number is 945
//
/////////////////////////////////////////////////////////////////