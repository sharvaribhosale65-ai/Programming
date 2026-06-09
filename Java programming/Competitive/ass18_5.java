/*
Algorithm:

    START
        Accept number as iNo
        Perform to check whether number is positive, negative or zero
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   checkSign
// Input    :           int
// Output   :           void
// Description  :       Perform to check whether number is positive, negative or zero
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkSign  (
                        int iNo                                 //variable to store input
                    )
    {
        if(iNo == 0)
        {
            System.out.println("Number is zero");
        }
        else if(iNo < 0)
        {
            System.out.println("Number is negative");
        }
        if(iNo > 0)
        {
            System.out.println("Number is positive");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check whether number is positive, negative or zero of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass18_5 
{
    public static void main()
    {
        Logic obj = new Logic();
        obj.checkSign(-8);                                        //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   -8
//Output    :   Number is negative
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
