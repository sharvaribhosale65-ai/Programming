/*
Algorithm:

    START
        Accept digit as iNo
        Perform to display the frequency of digits which is less than 6
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
// Function name    :   Count
// Input    :           int
// Output   :           int
// Description  :       Perform to display the frequency of digits which is less than 6
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////


int Count   (
                int iNo                     //input
            )
{
    int iDigit = 0;
    int iCnt = 0;

    if(iNo < 0)                             //set updator
    {
        iNo = -iNo;
    }

    while(iNo > 0)                          //perform loop
    {
        iDigit = iNo % 10;
        
        if(iDigit < 6)
        {
            iCnt++;
        }
        iNo = iNo / 10;
    }
    return iCnt;
}

/////////////////////////////////////////////////////////////////
//
// Application to perform to display the frequency of digits which is less than 6 of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;                          //to store input
    int iRet = 0;                            //variable to store return value   

    printf("Enter number : ");               //accept number from user
    scanf("%d",&iValue);

    iRet = Count(iValue);

    printf("%d",iRet);                       //display result

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  2395
// Output : 3
// Input :  1018
// Output : 3
//
/////////////////////////////////////////////////////////////////
