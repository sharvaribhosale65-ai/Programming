/*
Algorithm:

    START
        Accept number as num
        Perform smallest digit of given number
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   findSmallestDigit
// Input    :           int
// Output   :           void
// Description  :       Perform smallest digit of given number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit  (
                                int num                             //variable to store input
                            )
    {
        int iDigit = 0;                                             //variable to store digits
        int iSmallest = 9;                                          //variable to store result

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit < iSmallest)
            {
                iSmallest = iDigit;
            }
            num = num / 10;
        }
        System.out.println("Smallest number is : "+iSmallest);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform smallest digit of given number of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass20_5 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);                           //display result        
    }
    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   45872
//Output    :   Smallest number is : 2
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
