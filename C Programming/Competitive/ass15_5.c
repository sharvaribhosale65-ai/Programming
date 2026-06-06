/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform product of all odd elements
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
// Function name    :   Product
// Input    :           int, int
// Output   :           int
// Description  :       Perform product of all odd elements
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


int Product (   int Arr[],                              //input
                int iSize                               //size of input
            )
{
    int iCnt = 0;                                       //initialize the counter
    int iMult = 1;                                      //variable to store multiplication
    int iCount = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            iMult = iMult * Arr[iCnt];
            iCount++;
        }
    }
    if(iCount == 0)
    {
        return 0;
    }
    return iMult;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform product of all odd elements of 2 int values
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

    iRet = Product(P, iLength);                         //display result

    printf("%d",iRet);

    free(P);                                            //deallocate the memory

    return 0;

}

////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   15 66 3 70 10 88
//Output:   45
//
//Input:    N:  6
//          Elements:   44 66 72 70 10 88
//Output:   0
//
////////////////////////////////////////////////////////////////////////////////////////////////
