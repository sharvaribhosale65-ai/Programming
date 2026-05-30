/*
Algorithm:

    START
        Accept digit as iNo
        Perform to count frequency of 4 in it
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
// Function name    :   CountFour
// Input    :           int
// Output   :           int
// Description  :       Perform to count frequency of 4 in it
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////


int CountFour(
                int iNo                         //input
            )
{
    int iDigit = 0;
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while (iNo > 0)
    {
        iDigit = iNo % 10;
        {
            if(iDigit == 4)
            {
                iCnt++;
            }
        }
        iNo = iNo / 10;
    }
    return iCnt;
}

/////////////////////////////////////////////////////////////////
//
// Application to perform to count frequency of 4 in it of int value
//
/////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = CountFour(iValue);

    printf("%d",iRet);
    
    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : 0
// Input :  9440
// Output : 2
//
/////////////////////////////////////////////////////////////////
