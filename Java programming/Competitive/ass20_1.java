/*
Algorithm:

    START
        Accept number as n
        Perform to find sum of all even numbers up to N
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   sumEvenNumbers
// Input    :           int
// Output   :           void
// Description  :       Perform to find sum of all even numbers up to N
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers (
                            int n                               //variable to store input
                        )
    {
        int iCnt = 0;                                           //initialize the counter
        int iSum = 0;                                           //variable to store result

        for(iCnt = 0; iCnt <= n; iCnt = iCnt + 2)
        {
            iSum = iSum + iCnt;
        }        

        System.out.println("Sum of even numbers : "+iSum);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to find sum of all even numbers up to N of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass20_1 
{
    public static void main(String[] args) 
    {
       Logic obj = new Logic();
       obj.sumEvenNumbers(10);                                //display result 
    }  
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   10
//Output    :   Sum of even numbers : 30
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
