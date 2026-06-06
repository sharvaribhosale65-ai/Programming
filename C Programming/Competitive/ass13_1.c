/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform difference between summation of odd and even elements
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
// Function name    :   Difference
// Input    :           int, int
// Output   :           int
// Description  :       Perform difference between summation of odd and even elements
// Date :               04/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int Difference  (
                    int Arr[],                      //input
                    int iSize                       //size of input
                )
{
    int iCnt = 0;                                   //initialize counter
    int iEsum = 0;                                  //variable to store summation of even numbers
    int iOsum = 0;                                  //variable to store summation of odd numbers

    for(iCnt = 0; iCnt < iSize; iCnt++)

    if(Arr[iCnt] % 2 == 0)
    {
        iEsum = iEsum + Arr[iCnt];
    }

    else
    {
        iOsum = iOsum + Arr[iCnt];
    }

    return iEsum - iOsum;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform difference between summation of odd and even elements of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int *Brr = NULL;                                //initialize NULL pointer
    int iLength = 0;                                //to store size of input                
    int iCnt = 0;                                   //initialize counter
    int iRet = 0;                                   //initialize return value

    printf("Enter a number of element: ");          //accept n number from user
    scanf("%d",&iLength);

    Brr = (int *) malloc(iLength * sizeof(int));    //allocate the memory

    printf("Enter elements : ");                    //accept the elements

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = Difference(Brr, iLength);                //display the result

    printf("Result is %d",iRet);

    free(Brr);                                      //deallocate the memory

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   85 66 3 80 93 88
//Output:   53    
//
/////////////////////////////////////////////////////////////////////////////////////////////////
