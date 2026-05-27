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
// Function name    :   Display
// Input    :           int
// Output   :           int
// Description  :       Print even factors of that number
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

void Display(int iNo)
{
    int i = 0;                                          //input

    if(iNo < 0)                                         //updator
    {
        iNo = -iNo;
    }
    for(i = 2; i <= iNo/2; i = i + 2)
    {
        if((iNo % i) == 0)
        {
            printf("%d\t",i);
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
// Application to print even factors of that number of int value
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                                     //to store input
    
    printf("Enter number : ");
    scanf("%d",&iValue);

    Display(iValue);                                    //display result

    return 0;
}

/////////////////////////////////////////////////////////////////////////////
//
// Input :  24
// Output : 2       4       6       8       12
//
/////////////////////////////////////////////////////////////////////////////