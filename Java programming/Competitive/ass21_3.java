/*
Algorithm:

    START
        Accept number as num
        Perform to display all factors
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   displayFactors
// Input    :           int
// Output   :           void
// Description  :       Perform to display all factors
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayFactors (
                            int num                     //variable to store input 
                        )
    {
        int iCnt = 0;                                   //initialize the counter

        for(iCnt = 1; iCnt<= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display all factors of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass21_3 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.displayFactors(12);                     //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   12
//Output    :   1   2   3   4   6
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
