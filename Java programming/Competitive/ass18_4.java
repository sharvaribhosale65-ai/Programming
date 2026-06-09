/*
Algorithm:

    START
        Accept number as iNo
        Perform sum of even and odd digits
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   SumEvenOddDigits
// Input    :           int
// Output   :           void
// Description  :       Perform sum of even and odd digits
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void SumEvenOddDigits   (
                                int iNo                                     //variable to store input
                            )
    {
        int iCnt = 0;                                                       //initialize counter
        int iDigit = 0;                                                     //variable to store digits
        int sumEven = 0;                                                    //variable to store even count
        int sumOdd = 0;                                                     //variable to store odd count

        for(iCnt = 0; iCnt <= iNo; iCnt++)

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                sumEven = sumEven + iDigit;
            }
            else
            {
                sumOdd = sumOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Summation of even digits are : "+sumEven);
        System.out.println("Summation of odd digits are : "+sumOdd);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform sum of even and odd digits of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass18_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);                                       //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   123456
//Output    :   Summation of even digits are : 12
//              Summation of odd digits are : 9
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
