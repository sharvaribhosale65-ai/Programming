/*
Algorithm:

    START
        Accept number as num
        Print each digit of number 
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   printDigits
// Input    :           int
// Output   :           void
// Description  :       Print each digit of number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(
                        int num                     //variable to store input
                    )
    {
        int iDigit = 0;                             //variable to store digits

        while(num != 0)                             
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to print each digit of number of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass19_4 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printDigits(9876);                  //display result
    }    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   9876
//Output    :   6   7   8   9
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
