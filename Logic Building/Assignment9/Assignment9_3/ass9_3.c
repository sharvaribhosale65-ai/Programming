/*
Algorithm:

    START
        Accept number as iNo
        Perform the count of digits between 3 and 7
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
// Function name    :   CountRange
// Input    :           int
// Output   :           int
// Description  :       Perform the count of digits between 3 and 7
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int CountRange  (
                    int iNo                     //input
                )
{
    int iDigit = 0;
    int iCnt = 0;

    if(iNo < 0)                                 //set updator
    {
        iNo = -iNo;
    }

    while(iNo > 0)
    {
        iDigit = iNo % 10;

        if(iDigit > 3 && iDigit < 7)
        {
            iCnt++;
        }
        iNo = iNo / 10;
    }
    return iCnt;
}

/////////////////////////////////////////////////////////////////
//
// Application to count of digits in between 3 and 7 of int value
//
/////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                              //to store input
    int iRet = 0;                                //to store return value
    
    printf("Enter number : ");                   //accept number from user
    scanf("%d",&iValue);

    iRet = CountRange(iValue);                   //display result

    printf("%d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : 1
// Input :  1018
// Output : 0
//
/////////////////////////////////////////////////////////////////