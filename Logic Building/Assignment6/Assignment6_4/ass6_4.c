/*
Algorithm:

    START
        Accept number as iNo
        Perform to display table 
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
// Function name    :   Table
// Input    :           int
// Output   :           int
// Description  :       Perform to display table  
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void Table(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= 10; iCnt++)
    {
        printf("%d\t",iCnt * iNo);
    }
}

/////////////////////////////////////////////////////////////////
//
// Application to Perform to display table of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Table(iValue);
    
    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input    :   2
// Output   :   2       4       6       8       10      12      14      16      18      20
// Input    :   -5
// Output   :   5       10      15      20      25      30      35      40      45      50
//
/////////////////////////////////////////////////////////////////

//Time complexity : O(N)
//Where N >= 0