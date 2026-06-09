/*
Algorithm:

    START
        Accept number as num
        Perform largest digit of given number
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   findLargestDigit
// Input    :           int
// Output   :           void
// Description  :       Perform largest digit of given number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findLargestDigit   (
                                int num                                 //variable to store input
                            )
    {
        int iDigit = 0;                                                 //variable to store digits
        int iLargest = 0;                                               //variable to store result

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit > iLargest)
            {
                iLargest = iDigit;
            }
            num = num / 10;
        }

        System.out.println("Largest number is : "+iLargest);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform largest digit of given number of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass20_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);                              //display result   
    }    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   83429
//Output    :   Largest number is : 9
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
