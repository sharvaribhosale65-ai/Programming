/*
Algorithm:

    START
        Accept number as iNo
        Perform all its non factors
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
// Function name    :   NonFact
// Input    :           int
// Output   :           int
// Description  :       Perform all its non factors
// Date :               28/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void NonFact(
                int iNo                         //input
            )
{
    int iCnt = 0;                               //initialize counter

    for(iCnt = 1; iCnt <= iNo; iCnt++)          //perform loop
    {
        if((iNo % iCnt) != 0)
        {
            printf("%d\t",iCnt);
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to perform all its non factors of int value
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                             //to store input

    printf("Enter number : ");                  //accept the number from user
    scanf("%d",&iValue);

    NonFact(iValue);                            //display result

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  12
// Output : 5       7       8       9       10      11
//
/////////////////////////////////////////////////////////////////