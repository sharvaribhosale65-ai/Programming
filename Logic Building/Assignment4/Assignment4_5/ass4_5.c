/*
Algorithm:

    START
        Accept number as iNo
        Perform difference between summation of all its factors and non factors
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
// Function name    :   FactDiff
// Input    :           int
// Output   :           int
// Description  :       Perform difference between summation of all its factors and non factors
// Date :               28/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int FactDiff(
                int iNo                         //input
            )
{
    int iCnt = 0;                               //initialize counter
    int iFsum = 0;                              //variable to store factor sum
    int iNsum = 0;                              //variable to store non factor sum

    if(iNo < 0)
    {
        iNo = -iNo;                             //updator
    }

    for(iCnt = 1; iCnt < iNo; iCnt++)           //perform loop
    {
        if((iNo % iCnt) == 0)
        {
            iFsum = iFsum + iCnt;               
        }
        else
        {
            iNsum = iNsum + iCnt;
        }
    }
    return iFsum - iNsum;
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to perform summation of all its factors and non factors of int value
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                              //to store input
    int iRet = 0;                                //to store return value

    printf("Enter number : ");                   //accept number from user
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d",iRet);                           //display result

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  12
// Output : -34
//
/////////////////////////////////////////////////////////////////