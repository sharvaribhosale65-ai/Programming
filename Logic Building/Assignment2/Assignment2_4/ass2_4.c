//Accept two numbers from user and display first number in second number of time
/*
Algorithm:

    START
        Accept first number as iNo
        Accept second number as frequency
        Perform first number in second number of time   
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Display
// Input    :           int, int
// Output   :           int
// Description  :       Display first number in second number of time
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////

int Display (
                int iNo,                        //first input
                int frequency                   //second input
            )
{
    int iCnt = 0;

    if(frequency < 0)                           //updator
    {
        frequency = -frequency;
    }

    for(iCnt = 1; iCnt <= frequency; iCnt++)
    {
        printf("%d\t",iNo);
    }
}

////////////////////////////////////////////////////////////////////////////////////////
//
// Application to display first number in second number of time of int values
//
////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                              //to store first input
    int iCount = 0;                              //to store second input

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter frequency : ");
    scanf("%d",&iCount);

    Display(iValue, iCount);                     //display result

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////
//
// Input :  12  5
// Output : 12      12      12      12      12
// Input :  -2  3
// Output : -2      -2      -2
// Input :  21  -3
// Output : 21      21      21
// Input :  -2  0
// Output : 
//
///////////////////////////////////////////////////////////////////////////////////////