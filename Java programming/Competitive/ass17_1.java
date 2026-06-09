/*
Algorithm:

    START
        Accept number as iNo
        Perform sum of digits of number
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   SumOfDigits
// Input    :           int
// Output   :           void
// Description  :       Perform sum of digits of number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumOfDigits(
                        int iNo                                     //variable to store input
                    )                                       
    {
        int iCnt = 0;                                               //initialize counter               
        int iDigit = 0;                                             //variable to store digit
        int iSum = 0;                                               //variable to store result

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }
        
        System.out.println("Summation of digits : "+iSum);          
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform sum of digits of number of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass17_1
{
    public static void main(String A[])
    {
       Logic obj = new Logic();
       obj.SumOfDigits(1234);                                   //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   1234
//Output    :   Summation of digits : 10
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
