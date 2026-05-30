/*
Algorithm:

    START
        Accept number as iNo
        If number is less than 50
            print small
        If it is greater than 50 and less than 100
            print medium
        Otherwise 
            print large   
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
// Function name    :   Number
// Input    :           int
// Output   :           int
// Description  :       Perform the conditions 
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void Number(int iNo)
{
    if(iNo < 50)
    {
        printf("Small");
    }
    else if((iNo > 50) && (iNo < 100))
    {
        printf("Medium");
    }
    else if(iNo > 100)
    {
        printf("Large");
    }
}

/////////////////////////////////////////////////////////////////
//
// Application to perform the conditions of int value
//
/////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Number(iValue);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  75
// Output : Medium
//
/////////////////////////////////////////////////////////////////


//Time complexity : O(N)
//Where N >= 0 and N <= 0