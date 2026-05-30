/*
Algorithm:

    START
        Accept number as iNo
        Perform the difference between summation of even and odd digits
        Display the result
    STOP
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   CountDiff
// Input    :           int
// Output   :           int
// Description  :       Perform the difference between summation of even and odd digits
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int CountDiff   (
                    int iNo                        //input
                )
{
    int iDigit = 0;
    int iEsum = 0;
    int iOsum = 0;

    if(iNo < 0)                                   //set updator
    {
        iNo = -iNo;
    }

    while (iNo > 0)
    {
        iDigit = iNo % 10;

        if(iDigit % 2 == 0)
        {
            iEsum = iEsum + iDigit;
        }
        else
        {
            iOsum = iOsum + iDigit;
        }

        iNo = iNo / 10;
    }
    return iEsum - iOsum;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform difference between summation of even and odd digits of int value
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                              //to store input
    int iRet = 0;                                //to store return value
    
    printf("Enter number : ");                   //accept number from user
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);                   //display result

    printf("%d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : -15
// Input :  1018
// Output : 6
//
/////////////////////////////////////////////////////////////////