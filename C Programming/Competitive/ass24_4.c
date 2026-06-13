/*
Algorithm:

    START
        Accept first number as iNo1
        Accept second number as iNo2
        Perform to display pattern
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Pattern
// Input    :           int, int
// Output   :           void
// Description  :       Perform to display pattern
// Date :               13/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

void Pattern(
                int iNo1,                                   //first input       
                int iNo2                                    //second input
            )
{
    int i = 0;
    int j = 0;

    for(i = iNo1; i >= 1; i--)
    {
        for(j = 1; j <= iNo2; j++)
        {
           printf("%d\t",i);
           
        }
        printf("\n");
    }
}

int main()

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display pattern of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

{
    int iValue1 = 0;                                       //to store first input
    int iValue2 = 0;                                       //to store second input 

    printf("Enter number of rows : ");
    scanf("%d",&iValue1);
 
    printf("Enter number of columns : ");
    scanf("%d",&iValue2);

    Pattern(iValue1, iValue2);                            //display result 

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   4,  5
//Output    :   4       4       4       4       4
//              3       3       3       3       3
//              2       2       2       2       2
//              1       1       1       1       1
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
