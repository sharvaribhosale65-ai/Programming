/*
Algorithm:

    START
        Accept number as iNo
        Perform to print number into word  
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
// Description  :       Perform to print number into word 
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo == 0)
    {
        printf("Zero");
    }
    else if(iNo == 1)
    {
        printf("One");
    }
    else if(iNo == 2)
    {
        printf("Two");
    }
    else if(iNo == 3)
    {
        printf("Three");
    }
    else if(iNo == 4)
    {
        printf("Four");
    }
    else if(iNo == 5)
    {
        printf("Five");
    }
    else if(iNo == 6)
    {
        printf("Six");
    }
    else if(iNo == 7)
    {
        printf("Seven");
    }
    else if(iNo == 8)
    {
        printf("Eight");
    }
    else if(iNo == 9)
    {
        printf("Nine");
    }
    else
    {
        printf("Invalid number");
    }
    
}

/////////////////////////////////////////////////////////////////
//
// Application to Perform to print number into word of int value
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
// Input :  9
// Output : Nine
// Input :  3
// Output : Three
// Input :  12
// Output : Invalid number
//
/////////////////////////////////////////////////////////////////

//Time complexity : O(N)
//Where 9 >= N >= 0