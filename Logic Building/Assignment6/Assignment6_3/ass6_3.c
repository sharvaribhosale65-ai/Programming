/*
Algorithm:

    START
        Accept number as iNo
        Perform to find factorial of number 
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
// Function name    :   Factorial
// Input    :           int
// Output   :           int
// Description  :       Perform to find factorial of number
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int Factorial(int iNo)
{
    
    int iCnt = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo =  -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        iFact = iFact * iCnt;
    }
    return iFact;
}

/////////////////////////////////////////////////////////////////
//
// Application to Perform to find factorial of number of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);

    printf("Factorial of number is %d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  4
// Output : Factorial of number is 24
// Input :  -5
// Output : Factorial of number is 120
//
/////////////////////////////////////////////////////////////////

//Time complexity : O(N)
//Where N >= 0