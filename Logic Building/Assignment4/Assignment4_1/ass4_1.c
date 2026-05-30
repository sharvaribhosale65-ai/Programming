/*
Algorithm:

    START
        Accept number as iNo
        Perform multiplication of factors
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
// Function name    :   MultFact
// Input    :           int
// Output   :           int
// Description  :       Perform multiplication of factors
// Date :               28/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

int MultFact(
                int iNo                             //input
            )
{
    int iCnt = 0;                                   //variable to store result                     
    int iMult = 1;

    for(iCnt = 1; iCnt <= iNo/2; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iMult = iMult * iCnt;
        }
    }
    return iMult;
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to perform multiplication of factors of int value
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                                  //to store input
    int iRet = 0;                                    //initialize return value

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = MultFact(iValue);

    printf("%d",iRet);                               //display result

    return 0;
}

/////////////////////////////////////////////////////////////////
//
// Input :  12
// Output : 144
//
/////////////////////////////////////////////////////////////////