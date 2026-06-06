/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Accept another number as iNo 
        Perform to return index of last occurence of another number
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
// Function name    :   LastOcc
// Input    :           int, int, int
// Output   :           int
// Description  :       Perform to return index of last occurence of another number
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


int LastOcc(
                int Arr[],                                          //input
                int iSize,                                          //size of input
                int iNo                                             //another input
            )
{
    int iCnt = 0;
    int iIndex = -1;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
           iIndex = iCnt; 
        }
    }
    return iIndex;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to return index of last occurence of another number of 3 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *Brr = NULL;                                            //initialize NULL pointer
    int iLength = 0;                                            //variable to store size of input
    int iCnt = 0;                                               //initialize counter
    int iValue = 0;                                             //variable to store another input
    int iRet = 0;                                               //variable to store return value


    printf("Enter number of element : ");                       //accept number
    scanf("%d",&iLength);

    Brr = (int *) malloc (iLength * sizeof(int));               //allocate the memory

    printf("Enter elements : ");                                //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    printf("Enter number that you want to search : ");
    scanf("%d",&iValue);

    iRet = LastOcc(Brr, iLength, iValue);                       //display result

    if(iRet == -1)
    {
        printf("There is no such element");
    }
    else
    {
        printf("Last occurence of number is %d",iRet);
    }

    free(Brr);                                                  //deallocate memory

    return 0;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          NO: 66
//          Elements:   85 66 3 66 93 88
//Output:   Last occurence of number is 3
//
//Input:    N:  6
//          NO: 12
//          Elements:   85 11 3 15 11 111
//Output:   There is no such element
//
////////////////////////////////////////////////////////////////////////////////////////////////
