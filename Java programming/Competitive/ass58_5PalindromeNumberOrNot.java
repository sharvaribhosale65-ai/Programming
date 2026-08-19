//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   PalindromeNumber
//  Description     :   Check whether number is palindrome number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean PalindromeNumber(int iNo)  //121 = 121
    {
        int iRev = 0;
        int iDigit = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        return iTemp == iRev;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is palindrome number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass58_5PalindromeNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.PalindromeNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is palindrome number");
        }
        else
        {
            System.out.println("It is not palindrome number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   121
//  Output  :   It is palindrome number
//
//  Input   :   28
//  Output  :   It is not palindrome number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
