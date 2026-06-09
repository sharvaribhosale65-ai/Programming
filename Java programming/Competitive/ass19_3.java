/*
Algorithm:

    START
        Accept number as num
        Perform to check whether number is divisible by 5 and 11 or not
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   checkDivisible
// Input    :           int
// Output   :           void
// Description  :       Perform to check whether number is divisible by 5 and 11 or not
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible (
                            int num                                             //variable to store input
                        )
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check whether number is divisible by 5 and 11 or not of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass19_3 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);                                             //display result
    }    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   55
//Output    :   Number is divisible by 5 and 11
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
