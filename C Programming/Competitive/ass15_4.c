/*
Algorithm:

    START
        Accept number as Arr[]
        Accept size as iSize
        Accept iStart
        Accept iEnd
        Perform to display all elements of that range
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
// Input    :           int, int, int, int
// Output   :           void
// Description  :       Perform to display all elements of that range
// Date :               06/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


void Frequency(
                int Arr[],                                  //input
                int iSize,                                  //size of input
                int iStart,                                 //starting point
                int iEnd                                    //ending point
            )
{
    int iCnt = 0;                                           //initialize the counter

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] >= iStart && Arr[iCnt] <= iEnd)
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display all elements of that range of 4 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////


int main()
{
    int *P = NULL;                                          //initialize pointer with NULL value
    int iLength = 0;                                        //to store size of input
    int iCnt = 0;                                           //initialize the counter
    int iValue1 = 0;                                        //variable to store starting point
    int iValue2 = 0;                                        //variable to store ending point

    printf("Enter number of element : ");                   //accept number from user
    scanf("%d",&iLength);

    printf("Enter starting point : ");                      //accept starting point
    scanf("%d",&iValue1);

    printf("Enter ending point : ");                        //accept ending point
    scanf("%d",&iValue2);

    P = (int *) malloc (iLength * sizeof(int));             //allocate the memory

    if(P == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter elements : ");                            //accept elements
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&P[iCnt]);
    }

    Frequency(P, iLength, iValue1, iValue2);                //display result

    free(P);                                                //deallocate the memory

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input :   N:          6
//          Start   :   60  
//          End :       90 
//          Elements:   85 66 3 76 93 88
//Output:   85      66      76      88    
//
/////////////////////////////////////////////////////////////////////////////////////////////////
