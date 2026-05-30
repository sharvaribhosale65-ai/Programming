/*
Algorithm:

    START
        Accept number as iNo
        Find even factorial of number
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
// Function name    :   EvenFactorial
// Input    :           int
// Output   :           int
// Description  :       Find even factorial of number
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)    //5 4 3 2 1
    {
        if(iCnt % 2 == 0)
        {
            iFact = iFact * iCnt;
        }
    }
    return iFact;
}

/////////////////////////////////////////////////////////////////
//
// Application to find even factorial of number of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even factorial of number is %d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input    :   10
// Output   :   Even factorial of number is 3840
//
/////////////////////////////////////////////////////////////////