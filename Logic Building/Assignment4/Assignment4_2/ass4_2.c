/*
Algorithm:

    START
        Accept number as iNo
        Perform factors in decreasing order
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
// Function name    :   FactRev
// Input    :           int
// Output   :           int
// Description  :       Perform factors in decreasing order
// Date :               28/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void FactRev(
                int iNo                             //input
            )
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = iNo/2; iCnt >= 1; iCnt--)
    {
        if((iNo % iCnt) == 0)
        {
            printf("%d\t",iCnt);
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to perform factors in decreasing order of int value
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                                   //to store input

    printf("Enter number : ");
    scanf("%d",&iValue);

    FactRev(iValue);                                  //display result

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  12
// Output : 6       4       3       2       1
//
/////////////////////////////////////////////////////////////////