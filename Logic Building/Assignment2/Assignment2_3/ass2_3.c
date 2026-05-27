/*
Algorithm:

    START
        Accept number as iNo
        If iNo is less than 10
            then print Hello
        Otherwise
            print Demo    
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////


#include<stdio.h>

////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Display
// Input    :           int
// Output   :           int
// Description  :       If number is less than 10 print Hello otherwise print Demo
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////

void Display(
                int iNo                                     //input
            )
{
    if(iNo < 10)
    {
        printf("Hello");
    }
    else
    {
        printf("Demo");
    }
}

////////////////////////////////////////////////////////////////////////////////////////
//
// Application to display if number is less than 10 Hello otherwise Demo of int value
//
////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int iValue = 0;                                          //to store input   

    printf("Enter number : ");
    scanf("%d",&iValue);

    Display(iValue);                                         //display result

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////
//
// Input :  4
// Output : Hello
// Input :  11
// Output : Demo
//
///////////////////////////////////////////////////////////////////////////////////////