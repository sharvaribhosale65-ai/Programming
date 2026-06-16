/*
    Algorithm :
        Accept first input from user as iRow
        Accept second input from user as iCol
        Print given pattern
        Display result
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Pattern
// Input    :           int, int
// Output   :           void
// Description  :       Perform to display pattern
// Date :               16/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

void Pattern(
                int iRow,                                         //first input
                int iCol                                          //second input
            )
{
    int i = 0;
    int j = 0;

    if(iRow != iCol)
    {
        printf("Invalid parameters\n");
        printf("Rows and Columns should be same\n");
        return;
    }

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1; j <= iCol; j++)
        {
            if(i == j || i == 1 || i == iRow || j == 1 || j == iCol)
            {
                printf("*\t");
            }
            else
            {
                printf(" \t");
            }
        }
        printf("\n");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display pattern of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 0;                                                //to store first input
    int iValue2 = 0;                                                //to store second input

    printf("Enter number of rows : ");                              //accept rows from user
    scanf("%d",&iValue1);

    printf("Enter number of columns : ");                           //accept columns from user
    scanf("%d",&iValue2);

    Pattern(iValue1, iValue2);                                      //display result

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   6, 6
//Output    :   *       *       *       *       *       *
//              *       *                               *
//              *               *                       *
//              *                       *               *
//              *                               *       *
//              *       *       *       *       *       *
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
