/*
Algorithm:

    START
        Accept first number as base
        Accept second number as exp
        Perform to calculate power of a number
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   calculatePower
// Input    :           int, int
// Output   :           void
// Description  :       Perform to calculate power of a number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower (
                            int base,                       //variable to store first input
                            int exp                         //variable to store second input
                        )
    {
        int iCnt = 0;                                       //initialize the counter
        int iResult = 1;                                    //variable to store result

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult * base;
        }   
        
        System.out.println("Power is : "+iResult);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to calculate power of a number of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass19_5 
{
    public static void main(String[] args) 
    {
       Logic obj = new Logic();
       obj.calculatePower(2,5);                    //display result 
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   2   5
//Output    :   Power is : 32
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
