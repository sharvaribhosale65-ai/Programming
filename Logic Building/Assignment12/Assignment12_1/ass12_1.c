/*
Algorithm:

    START
        Accept digit as iNo
        Perform to display the digits in reverse order
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
// Function name    :   CountEven
// Input    :           int
// Output   :           int
// Description  :       Perform to display the digits in reverse order
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void DisplayDigit(
                    int iNo             //input
                 )
{
    int iDigit = 0;                     

    if(iNo < 0)                         //set updator
    {
        iNo = -iNo;
    }

    while(iNo > 0)                      //perform loop
    {
        iDigit = iNo % 10;
        printf("%d\n",iDigit);
        iNo = iNo / 10;
    }
}

/////////////////////////////////////////////////////////////////
//
// Application to perform to display the digits in reverse order of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;                     //to store input

    printf("Enter number : ");          //accept number from user
    scanf("%d",&iValue);

    DisplayDigit(iValue);               //display result

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : 5
//          9
//          3
//          2
//
/////////////////////////////////////////////////////////////////