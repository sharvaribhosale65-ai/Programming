//Write a program which accept one number from user and print that number of even numbers on screen

/*
Algorithm:

    START
        Accept number as iNo
        Print that number of even number
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
// Function name    :   PrintEven
// Input    :           int
// Output   :           int
// Description  :       Print that number of even number
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void PrintEven  (
                    int iNo                  //input
                )
{

    int iCnt = 0;                   

    if(iNo <= 0)                             //updator
    {
        return;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%d\t",iCnt*2);
    }
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to print that number of even number of int value
//
/////////////////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;                            //to store input 

    printf("Enter number : ");
    scanf("%d",&iValue);

    PrintEven(iValue);                         //display result 

    return 0;
}

/////////////////////////////////////////////////////////////////////////////
//
// Input :  7
// Output : 2       4       6       8       10      12      14
//
/////////////////////////////////////////////////////////////////////////////