/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to return frequency of even number
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
// Function name    :   CountEven
// Input    :           int, int
// Output   :           int
// Description  :       Perform to return frequency of even number
// Date :               04/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


int CountEven   (
                    int Arr[],                          //input
                    int iSize                           //size of input
                )
{
    int iCnt = 0;                                       //initialize the counter
    int iEvenCount = 0;                                 //variable to store even count

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iEvenCount++;
        }
    }
    return iEvenCount++;
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to return frequency of even number of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *Brr = NULL;                                    //initialize NULL pointer
    int iLength = 0;                                    //variable to store size of input
    int iCnt = 0;                                       //initialize counter
    int iRet = 0;                                       //variable to store return value

    printf("Enter number of elements : ");              //accept number form user
    scanf("%d",&iLength);

    Brr = (int *) malloc(iLength * sizeof(int));        //allocate the memory

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

    iRet = CountEven(Brr, iLength);

    printf("Count is %d", iRet);                        //display result

    free(Brr);                                          //deallocate memory

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   85 66 3 80 93 88
//Output:   Count is 3
//
/////////////////////////////////////////////////////////////////////////////////////////////////