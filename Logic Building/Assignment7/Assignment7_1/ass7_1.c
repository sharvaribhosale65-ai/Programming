/*
Algorithm:

    START
        Accept number as iNo
        Perform to display given pattern
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
// Function name    :   Display
// Input    :           int
// Output   :           int
// Description  :       Perform to display given pattern
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////


void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("*\t");
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("#\t");
    }
}

/////////////////////////////////////////////////////////////////
//
// Application to Perform to display given pattern of int value
//
/////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input    :   3
// Output   :   *       *       *       #       #       #
// Input    :   -2
// Output   :   *       *       #       #       
//
/////////////////////////////////////////////////////////////////