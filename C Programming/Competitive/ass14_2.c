/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to return difference between frequency of even and odd numbers
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
// Function name    :   Frequency
// Input    :           int, int
// Output   :           int
// Description  :       Perform to return difference between frequency of even and odd numbers
// Date :               04/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


int Frequency   (
                    int Arr[],                          //input
                    int iSize                           //size of input
                )
{
    int iCnt = 0;                                       //initialize the counter
    int iEvenCount = 0;                                 //variable to store even count
    int iOddCount = 0;                                  //variable to store odd count

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iEvenCount++;
        }
        else
        {
            iOddCount++;
        }
    }
    return (iEvenCount++ - iOddCount);
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to return difference between frequency of even and odd numbers of 2 int values
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

    iRet = Frequency(Brr, iLength);

    printf("%d", iRet);                                 //display result

    free(Brr);                                          //deallocate memory

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   85 66 3 80 93 88 90
//Output:   1
//
/////////////////////////////////////////////////////////////////////////////////////////////////