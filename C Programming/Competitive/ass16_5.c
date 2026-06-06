/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to display summation of each digit
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   DigitSum
// Input    :           int, int
// Output   :           int
// Description  :       Perform to display summation of each digit
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


void DigitSum(
                int Arr[],                             //input 
                int iSize                              //size of input 
            )
{
    int iCnt = 0;
    int iDigit = 0;
    int iNo = 0;
    int iSum = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        iNo = Arr[iCnt];
        iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        printf("%d\t",iSum);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display summation of each digit of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int *Brr = NULL;                                    //initialize NULL pointer
    int iLength = 0;                                    //to store size of input
    int iCnt = 0;                                       //initialize the counter
 

    printf("Enter number of element : ");               //accept number
    scanf("%d",&iLength);

    Brr = (int *) malloc (iLength * sizeof(int));       //allocate the memory

    printf("Enter elements : ");                        //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    DigitSum(Brr, iLength);                             //display result

    free(Brr);                                          //deallocate the memory
    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   8225 665 3 76 953 858
//Output:   17      17      3       13      17      21  
//
/////////////////////////////////////////////////////////////////////////////////////////////////
