/*
Algorithm:

    START
        Accept number as num
        Perform to count total number of factors
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   countfactors
// Input    :           int
// Output   :           void
// Description  :       Perform to count total number of factors
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countfactors   (
                            int num                                         //variable to store input 
                        )
    {
        int iCnt = 0;                                                       //initialize the counter
        int iTotalCount = 0;                                                //variable to store result

        for(iCnt = 1; iCnt<= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iTotalCount++;
            }
        }
        System.out.println("Total count of factors : "+iTotalCount);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to count total number of factors of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass21_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.countfactors(20);                                           //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   20
//Output    :   Total count of factors : 5
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
