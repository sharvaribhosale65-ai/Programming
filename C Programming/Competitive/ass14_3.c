/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to check it contains 11 in it or not
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
// Input    :           int, int
// Output   :           int
// Description  :       Perform to check it contains 11 in it or not
// Date :               04/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

bool Check  (
                int Arr[],                              //input
                int iSize                               //size of input
            )
{
    int iCnt = 0;                                       //initialize the counter
    bool bFlag = false;                 

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            bFlag = true;
        }
    }
    return bFlag;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check it contains 11 in it or not of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int *Brr = NULL;                                    //initialize NULL pointer
    int iLength = 0;                                    //variable to store size of input
    int iCnt = 0;                                       //initialize counter
    bool bRet = false;                                  //to store return value

    printf("Enter number of element : ");               //accept number from user
    scanf("%d",&iLength);

    Brr = (int *) malloc (iLength * sizeof(int));       //allocate the memory

    if(Brr == NULL)
    {
        printf("Unable to allocate the memory");
        return -1;
    }
    
    printf("Enter the elements : ");                    //accept the elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    bRet = Check(Brr, iLength);                         //display result

    if(bRet == true)
    {
        printf("It contains 11 in it.");
    }
    else
    {
        printf("It does not contains 11 in it.");
    }

    free(Brr);                                          //deallocate the memory

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   84 66 11 80 93 88
//Output:   It contains 11 in it.
//Input :   N:  6
//          Elements:   84 66 3 80 93 88
//Output:   It does not contains 11 in it.
//
/////////////////////////////////////////////////////////////////////////////////////////////////