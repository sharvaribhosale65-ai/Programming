/*
Algorithm:

    START
        Accept number as iValue
        Perform to check number is divisible by 5 or not
        Display the result
    STOP
*/

/////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;

#define TRUE 1
#define FALSE 0

/////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Check
// Input    :           int
// Output   :           int
// Description  :       Check number is divisible by 5 or not
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

BOOL Check  (
                int iNo                         //input
            )
{
    if((iNo % 5) == 0)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

////////////////////////////////////////////////////////////////////////////
//
// Application to check number is divisible by 5 or not of int value
//
////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                             //To store input
    BOOL bRet = FALSE;

    printf("Enter number: ");
    scanf("%d",&iValue);

    bRet = Check(iValue);                       //Perform result

    if(bRet == TRUE)
    {
        printf("Divisible by 5");
    }
    else
    {
        printf("Not divisible by 5");
    }

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  15      5
// Output : 3
//
/////////////////////////////////////////////////////////////////