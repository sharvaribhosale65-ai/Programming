/*
Algorithm:

    START
        Accept number as num
        Perform to count even and odd numbers are present between 1 and N
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   CountEvenOdd
// Input    :           int
// Output   :           void
// Description  :       Perform to count even and odd numbers are present between 1 and N
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CountEvenOdd   (
                            int num                                     //variable to store input                                             
                        )
    {
        int iCnt = 0;                                                   //initialize the counter
        int iEven = 0;                                                  //variable to count even digits
        int iOdd = 0;                                                   //variable to count odd digits

        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Count of even digit : "+iEven);
        System.out.println("Count of odd digit : "+iOdd);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to count even and odd numbers are present between 1 and N of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass21_2 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.CountEvenOdd(50);                                        //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   50
//Output    :   Count of even digit : 24
//              Count of odd digit : 25
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
