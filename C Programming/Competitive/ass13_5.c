/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to display such elements which are multiples of 11
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
// Output   :           void
// Description  :       Perform to display such elements which are multiples of 11
// Date :               04/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


void Display(
                int Arr[],                              //input          
                int iSize                               //size of input 
            )
{
    int iCnt = 0;                                       //initialize the counter

    for(iCnt = 0; iCnt < iSize; iCnt++)

    if(Arr[iCnt] % 11 == 0)
    {
        printf("%d\t",Arr[iCnt]);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display such elements which are multiples of 11 of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *Brr = NULL;                                    //initialize NULL pointer
    int iLength = 0;                                    //variable to store size of input
    int iCnt = 0;                                       //initialize counter

    printf("Enter number of elements : ");              //accept number from user
    scanf("%d",&iLength);

    Brr = (int *) malloc(iLength * sizeof(int));        //allocate the memory

    if(Brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter elements : ");                        //accept the elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    Display(Brr, iLength);                              //display result

    free(Brr);                                          //deallocate the memory

    return 0;
}


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   85 66 55 15 93 88
//Output:   66      55      88
//
/////////////////////////////////////////////////////////////////////////////////////////////////