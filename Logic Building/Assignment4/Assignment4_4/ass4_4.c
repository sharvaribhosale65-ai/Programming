/*
Algorithm:

    START
        Accept number as iNo
        Perform summation of all non factors
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
// Function name    :   SumNonFact
// Input    :           int
// Output   :           int
// Description  :       Perform summation of all non factors
// Date :               28/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int SumNonFact  (
                    int iNo                         //input
                )
{
    int iCnt = 0;                                   //initialize counter
    int iSum = 0;                                   //variable to store result

    if(iNo < 0)
    {
        iNo = -iNo;                                 //updator
    }

    for(iCnt = 1; iCnt < iNo; iCnt++)               //perform loop
    {
        if((iNo % iCnt) != 0)
        {
            iSum = iSum + iCnt;
        }
    }
    return iSum;
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to perform summation of all non factors of int value
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                                 //to store input
    int iRet = 0;

    printf("Enter number : ");                      //accept number from user
    scanf("%d",&iValue);

    iRet = SumNonFact(iValue);

    printf("%d",iRet);                              //display result

    return 0;  
}

/////////////////////////////////////////////////////////////////
//
// Input :  10
// Output : 37
//
/////////////////////////////////////////////////////////////////