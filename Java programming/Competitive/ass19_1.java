/*
Algorithm:

    START
        Accept number as year
        Perform to check whether year is leap year or not
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   checkLeapYear
// Input    :           int
// Output   :           void
// Description  :       Perform to check whether year is leap year or not
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear  (
                            int year                            //variable to store input
                        )
    {
        if(year % 4 == 0)                           
        {
            System.out.println("Leap year");
        }
        else
        {
           System.out.println("Not a leap year"); 
        } 
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check whether year is leap year or not of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass19_1 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);                            //display result
    }   
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   2024
//Output    :   Leap year
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
