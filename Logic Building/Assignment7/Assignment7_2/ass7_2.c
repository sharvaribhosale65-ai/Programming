/*
Algorithm:

    START
        Accept number as iNo
        Convert US dollar into indian currency
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
// Function name    :   DollerToINR
// Input    :           int
// Output   :           int
// Description  :       Convert US dollar into indian currency
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int DollerToINR(int iNo)
{
    int iAns = 0;

    iAns = iNo * 70;

    return iAns;
}

/////////////////////////////////////////////////////////////////
//
// Application to convert US dollar into indian currency of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = DollerToINR(iValue);

    printf("Value in INR is %d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input    :   10
// Output   :   Value in INR is 700
//
/////////////////////////////////////////////////////////////////