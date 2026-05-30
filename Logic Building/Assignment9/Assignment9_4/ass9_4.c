/*
Algorithm:

    START
        Accept number as iNo
        Perform the multiplication of all digits
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
// Function name    :   MultDigits
// Input    :           int
// Output   :           int
// Description  :       Perform the multiplication of all digits
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int MultDigits  (
                    int iNo                     //input
                )
{
    int iDigit = 0;
    int iCnt = 0;
    int iMult = 1;

    if(iNo < 0)                                 //set updator
    {
        iNo = -iNo;
    }

    while (iNo > 0)
    {
        iDigit = iNo % 10;
        {
            iMult = iMult * iDigit;
        }
        iNo = iNo / 10;
    }
    return iMult;
}

/////////////////////////////////////////////////////////////////
//
// Application to multiplication of all digits of int value
//
/////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                              //to store input
    int iRet = 0;                                //to store return value
    
    printf("Enter number : ");                   //accept number from user
    scanf("%d",&iValue);

    iRet = MultDigits(iValue);                   //display result

    printf("%d",iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : 270
// Input :  1018
// Output : 0
//
/////////////////////////////////////////////////////////////////