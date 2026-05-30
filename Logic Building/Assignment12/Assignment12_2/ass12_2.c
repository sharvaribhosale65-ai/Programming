/*
Algorithm:

    START
        Accept digit as iNo
        Check it contains 0 in it or not
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
// Function name    :   ChkZero
// Input    :           int
// Output   :           int
// Description  :       Check it contains 0 in it or not
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////


BOOL ChkZero(int iNo)
{
    int iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while (iNo > 0)
    {
        iDigit = iNo % 10;
        {
            if(iDigit == 0)
            return TRUE;
        }
        iNo = iNo / 10;
    }
    return FALSE;  
}

/////////////////////////////////////////////////////////////////
//
// Application to check it contains 0 in it or not of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;
    int bRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    bRet = ChkZero(iValue);

    if(bRet == TRUE)
    {
        printf("It contains zero");
    }
    else
    {
        printf("There is no zero");
    }
    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : There is no zero
// Input :  1018
// Output : There is zero
//
/////////////////////////////////////////////////////////////////
