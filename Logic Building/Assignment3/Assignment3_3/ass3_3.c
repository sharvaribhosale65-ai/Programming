/*
Algorithm:

    START
        Accept number as iNo
        Print even factors of that number
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
// Function name    :   DisplayEvenFactor
// Input    :           int
// Output   :           int
// Description  :       Print even factors of that number
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void DisplayEvenFactor  (
                            int iNo                     //input
                        )
{
    int iCnt = 0;                                       

    if(iNo <= 0)                                        //updator
    {
        iNo = -iNo;
    }
    for(iCnt = 2; iCnt <= iNo/2; iCnt = iCnt + 2)
    {
        if(((iNo % 2) == 0) && ((iNo % iCnt) == 0))
        {
            printf("%d\t",iCnt);
        }
    }
}

////////////////////////////////////////////////////////////////////////////
//
// Application to print even factors of that number of int value
//
////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                                       //to store input

    printf("Enter number : ");
    scanf("%d",&iValue);

    DisplayEvenFactor(iValue);                            //display result

    return 0;
}

//////////////////////////////////////////////////////////////////////////////
//
// Input :  36
// Output : 2       4       6       12      18
//
//////////////////////////////////////////////////////////////////////////////