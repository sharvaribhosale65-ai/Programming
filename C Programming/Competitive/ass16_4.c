/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Perform to display numbers which contais 3 digits
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
// Function name    :   Digits
// Input    :           int, int
// Output   :           int
// Description  :       Perform to display numbers which contais 3 digits
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


void Digits(
                int Arr[],                             //input 
                int iSize                              //size of input 
            )
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] >= 100 && Arr[iCnt] <= 999)
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display numbers which contais 3 digits of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *Brr = NULL;                                    //initialize NULL pointer
    int iLength = 0;                                    //to store size of input
    int iCnt = 0;                                       //initialize the counter
     

    printf("Enter number of element : ");               //accept number
    scanf("%d",&iLength);

    Brr = (int *) malloc (iLength * sizeof(int));       //allocate the memory

    printf("Enter elements : ");                        //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    Digits(Brr, iLength);                               //display result

    free(Brr);                                          //deallocate memory
    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:  6
//          Elements:   8225 665 3 76 953 858
//Output:   665     953     858   
//
/////////////////////////////////////////////////////////////////////////////////////////////////
