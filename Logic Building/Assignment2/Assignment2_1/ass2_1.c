/*
Algorithm:

    START
        Accept number as iValue
        Print * of number
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
// Description  :       Print * of numbers
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void Display(
                int iNo                     //input
            )
{
    int iCnt = 0;

    if(iNo < 0)                             //write updator
    {
        iNo = -iNo;
    }

    iCnt = 1;

    while(iCnt <= iNo)
    {
        printf("*");
        iCnt++;
    }
}

////////////////////////////////////////////////////////////////////////////
//
// Application to print number of * of int value
//
////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                         //to store input

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Display(iValue);                        //display result

    return 0;
}

////////////////////////////////////////////////////////////////////////////
//
// Input :  3
// Output : ***
//
////////////////////////////////////////////////////////////////////////////