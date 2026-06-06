/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Accept another number as iNo 
        Perform to check another number is present or not
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
#include<stdbool.h>

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Check
// Input    :           int, int, int
// Output   :           bool
// Description  :       Perform to check another number is present or not
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


bool Check  (
                int Arr[],                      //input
                int iSize,                      //size of input
                int iNo                         //another input
            )
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            break;
        }
    }
    if(iCnt < iSize)
    {
        return true;
    }
    else
    {
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check another number is present or not of 3 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *Brr = NULL;                                  //initialize NULL pointer
    int iLength = 0;                                  //variable to store size of input
    int iCnt = 0;                                     //initialize counter
    int iValue = 0;                                   //variable to store another input
    bool bRet = false;                                //variable to store return value


    printf("Enter number of element : ");             //accept number
    scanf("%d",&iLength);

    Brr = (int *) malloc (iLength * sizeof(int));     //allocate the memory

    printf("Enter elements : ");                      //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    printf("Enter number that you want to search : ");
    scanf("%d",&iValue);

    bRet = Check(Brr, iLength, iValue);                 //display result

    if(bRet == true)
    {
        printf("Number is present");
    }
    else
    {
        printf("Number is absent");
    }

    free(Brr);                                         //deallocate memory 

    return 0;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          NO: 66
//          Elements:   85 66 3 66 93 88
//Output:   Number is present
//
//Input:    N:  6
//          NO: 12
//          Elements:   85 11 3 15 11 111
//Output:   Number is absent
//
////////////////////////////////////////////////////////////////////////////////////////////////