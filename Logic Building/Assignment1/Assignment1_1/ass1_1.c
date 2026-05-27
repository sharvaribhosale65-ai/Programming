/*
Algorithm:

    START
        Accept first number as iValue1
        Accept second number as iValue2
        Perform division of iValue1 and iValue2
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
// Function name    :   Divide
// Input    :           int, int
// Output   :           int
// Description  :       Perform division of two numbers
// Date :               24/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int Divide (
                int iNo1,                   //First input
                int iNo2                    //Second input
           )
{
    int iAns = 0;                           //Variable to store result

    if(iNo2 < 0)
    {
        return -1;
    }
    iAns = iNo1 / iNo2;                     //Perform division

    return iAns;
}

/////////////////////////////////////////////////////////////////
//
// Application to perform division of 2 int values
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue1 = 15;                       //To store first input
    int iValue2 = 5;                        //To store second input
    int iRet = 0;

    iRet = Divide(iValue1, iValue2);

    printf("Division is %d", iRet);
    
    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  15      5
// Output : 3
//
/////////////////////////////////////////////////////////////////