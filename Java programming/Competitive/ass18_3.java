/*
Algorithm:

    START
        Accept number as iNo
        Print all odd numbers
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   PrintOddNumbers
// Input    :           int
// Output   :           void
// Description  :       Print all odd numbers
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintOddNumbers(
                            int iNo                         //variable to store input
                        )
    {
        int iCnt = 0;                                       //initialize the counter
        for(iCnt = 1; iCnt <= iNo; iCnt = iCnt + 2)
        {
            System.out.println(iCnt);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to print all odd numbers of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass18_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintOddNumbers(20);                        //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   20
//Output    :   1   3   5   7   9   11  13  15  17  19
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
