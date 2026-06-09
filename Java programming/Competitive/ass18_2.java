/*
Algorithm:

    START
        Accept number as iNo
        Print all even numbers
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   PrintEvenNumbers
// Input    :           int
// Output   :           void
// Description  :       Print all even numbers
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintEvenNumbers   (
                                int iNo                         //variable to store input
                            )
    {
        int iCnt = 0;                                           //initialize counter
        for(iCnt = 2; iCnt <= iNo; iCnt = iCnt + 2)             //perform loop
        {
                System.out.println(iCnt);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to print all even numbers of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass18_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintEvenNumbers(20);                           //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   20
//Output    :   2   4   6   8   10  12  14  16  18  20
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
