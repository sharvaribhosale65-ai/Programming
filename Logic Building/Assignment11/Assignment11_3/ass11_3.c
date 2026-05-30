/*
Algorithm:

    START
        Accept first number as iStart
        Accept second number as iEnd
        Perform addition of all numbers in between of that range
        Display the result
    STOP
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   RangeSum
// Input    :           int, int
// Output   :           int
// Description  :       Perform addition of all numbers in between of that range
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


int RangeSum(
                int iStart,                         //first input
                int iEnd                            //second input
            )
{
    int iCnt = 0;                                   //initialize counter
    int iSum = 0;                                   //variable to store the result

    if(iStart > iEnd || iStart < 0)                 //perform the condition
    {
        printf("Invalid range");
        return 0;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)        //perform loop
    {
        iSum = iSum + iCnt;
    }
    return iSum;
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform addition of all numbers in between of that range of 2 int values
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 0;                                //store first input
    int iValue2 = 0;                                //store second input
    int iRet = 0;                                   //variable to store return value

    printf("Enter starting point : ");              //accept first input from user
    scanf("%d",&iValue1);

    printf("Enter ending point : ");                //accept second input from user
    scanf("%d",&iValue2);

    iRet = RangeSum(iValue1, iValue2);

    printf("Addition is %d", iRet);                 //display result

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   23       30
// Output   :   Addition is 212
// Input    :   -10       2
// Output   :   Invalid range
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////