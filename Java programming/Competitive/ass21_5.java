/*
Algorithm:

    START
        Accept number as n
        Perform to print numbers which are divisible by 2 and 3
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   PrintDivisibleBy2and3
// Input    :           int
// Output   :           void
// Description  :       Perform to print numbers which are divisible by 2 and 3
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintDivisibleBy2and3  (
                                    int n                   //variable to store input 
                                )
    {
        int iCnt = 0;                                       //initialize the counter

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to print numbers which are divisible by 2 and 3 of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass21_5 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.PrintDivisibleBy2and3(30);                    //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   30
//Output    :   6   12  18  24  30
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
