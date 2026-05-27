/*
Algorithm:

    START
        Accept number as iNo
        Check iNo is even or odd
        Display the result
    STOP
*/

/////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

/////////////////////////////////////////////////////////////////////////////
//
// Function name    :   ChkEven
// Input    :           int
// Output   :           int
// Description  :       Check number is even or odd
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

BOOL ChkEven(int iNo)
{
    if((iNo % 2) == 0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

/////////////////////////////////////////////////////////////////
//
// Application to check number is even or odd of int value
//
/////////////////////////////////////////////////////////////////

int main()
{

    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%d",&iValue);

    bRet = ChkEven(iValue);

    if(bRet == TRUE)
    {
        printf("The given number is even");
    }
    else
    {
        printf("The given number is odd");
    }

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  4
// Output : The given number is even
// Input :  7
// Output : The given number is odd
//
/////////////////////////////////////////////////////////////////