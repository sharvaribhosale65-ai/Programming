/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to return smallest number
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
// Function name    :   Minimum
// Input    :           int, int
// Output   :           int
// Description  :       Perform to return smallest number
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int Minimum (
                int Arr[],                                          //input
                int iSize                                           //size of input
            )
{
    int iCnt = 0;
    int iMin = 0;

    iMin = Arr[0];

    for(iCnt = 1; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    }
    return iMin;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to return smallest number of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *P = NULL;                                                  //initialize NULL pointer
    int iLength = 0;                                                //to store size of input
    int iCnt = 0;                                                   //initialize the counter
    int iRet = 0;                                                   //variable to store return value

    printf("Enter number of elements : ");                          //accept number 
    scanf("%d",&iLength);

    P = (int *) malloc (iLength * sizeof(int));                     //allocate the memory

    if(P == NULL)
    {
        printf("Unable to allocate the memory");
        return -1;
    }

    printf("Enter elements : ");                                    //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&P[iCnt]);
    }


    iRet = Minimum(P, iLength);                                     //display result

    printf("Smallest number is %d",iRet);

    free(P);                                                        //deallocate memory

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   85 66 3 66 93 88
//Output:   Smallest number is 3    
//
/////////////////////////////////////////////////////////////////////////////////////////////////
