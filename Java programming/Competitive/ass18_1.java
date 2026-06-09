/*
Algorithm:

    START
        Accept number as iNo
        Perform to check whether number is prime or not
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   CheckPrime
// Input    :           int
// Output   :           void
// Description  :       Perform to check whether number is prime or not
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPrime (
                        int iNo                                 //variable to store input
                    )
    {
        int iCnt = 0;                                           //initialize counter
        for(iCnt = 2; iCnt < iNo; iCnt++)                       //perform loop
        {
            if(iNo % iCnt == 0)
            {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check whether number is prime or not of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass18_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);                                 //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   11
//Output    :   Number is prime
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
