/*
Algorithm:

    START
        Accept number as iNo
        Perform to check whether number is palindrome or not
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   CheckPalindrome
// Input    :           int
// Output   :           void
// Description  :       Perform to check whether number is palindrome or not
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void CheckPalindrome(
                            int iNo                                 //variable to store input
                        )                                           
    {
        int iCnt = 0;                                               //initialize counter
        int iDigit = 0;                                             //variable to store digit
        int iRev = 0;
        int iTemp = iNo;

        for(iCnt = 0; iCnt < iNo; iCnt++)
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        if(iTemp == iRev)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check whether number is palindrome or not of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass17_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);                                   //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   121
//Output    :   It is a palindrome
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
