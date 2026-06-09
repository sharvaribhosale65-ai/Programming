/*
Algorithm:

    START
        Accept number as num
        Perform to calculate product of digits of number
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   productOfDigits
// Input    :           int
// Output   :           void
// Description  :       Perform to calculate product of digits of number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(
                            int num                                 //variable to store input
                        )
    {
        int iDigit = 0;                                             //variable to store digits
        int iProduct = 1;                                           //variable to store result

        while(num != 0)
        {
            iDigit = num % 10;
            iProduct = iProduct * iDigit;
            num = num / 10;
        }    
        System.out.println("Product of digits is : "+iProduct);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to calculate product of digits of number of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass21_1 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);                               //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   234
//Output    :   Product of digits is : 24
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
