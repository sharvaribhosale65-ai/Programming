/*
Algorithm:

    START
        Accept number as n
        Perform to print numbers from N to 1 in reverse order
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   printReverse
// Input    :           int
// Output   :           void
// Description  :       Perform to print numbers from N to 1 in reverse order
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse   (
                            int n                   //variable to store input
                        )
    {
       int iCnt = 0;                                //initialize the counter
       
       for(iCnt = 10; iCnt >= 1; iCnt--)
       {
        System.out.print(" " + iCnt);
       }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to print numbers from N to 1 in reverse order of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass20_2 
{
    public static void main(String[] args) 
    {
       Logic obj = new Logic();
       obj.printReverse(10);                      //display result 
    }  
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   10
//Output    :   10 9 8 7 6 5 4 3 2 1
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////

