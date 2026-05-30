/*
Algorithm:

    START
        Accept digit as iNo
        Perform to count frequency of 2 in it
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
// Function name    :   CountTwo
// Input    :           int
// Output   :           int
// Description  :       Perform to count frequency of 2 in it
// Date :               29/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////


int CountTwo(
                int iNo                 //input
            )
{
    int iDigit = 0;
    int iCnt = 0;

    if(iNo < 0)                         //set updator
    {
        iNo = -iNo;
    }

    while (iNo > 0)                     //perform loop
    {
        iDigit = iNo % 10;
        
        if(iDigit == 2)
        {
            iCnt++;
        }
        iNo = iNo / 10;
    }
    return iCnt; 
    
}
/////////////////////////////////////////////////////////////////
//
// Application to Perform to count frequency of 2 in it of int value
//
/////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;                     //to store input
    int iRet = 0;                       //to store return value

    printf("Enter number : ");          //accept number from user
    scanf("%d",&iValue);

    iRet = CountTwo(iValue);

    printf("%d",iRet);                  //display result

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
