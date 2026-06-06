/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to return largest number
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
// Function name    :   Maximum
// Input    :           int, int
// Output   :           int
// Description  :       Perform to return largest number
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

int Maximum (
                int Arr[],                             //input 
                int iSize                              //size of input 
            )
{
    int iCnt = 0;                                      //initialize the counter
    int iMax = 0;

    iMax = Arr[0];

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }
    return iMax;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to return largest number of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *P = NULL;                                      //initialize NULL pointer
    int iLength = 0;                                    //to store size of input
    int iCnt = 0;                                       //initialize the counter
    int iRet = 0;                                       //variable to store return value

    printf("Enter number of elements : ");              //accept number 
    scanf("%d",&iLength);

    P = (int *) malloc (iLength * sizeof(int));         //allocate the memory

    if(P == NULL)
    {
        printf("Unable to allocate the memory");
        return -1;
    }

    printf("Enter elements : ");                        //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&P[iCnt]);
    }

    iRet = Maximum(P, iLength);                         //display result

    printf("Largest number is %d",iRet);

    free(P);                                            //deallocate the memory

    return 0;

}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   85 66 3 66 93 88
//Output:   Largest number is 93    
//
/////////////////////////////////////////////////////////////////////////////////////////////////
