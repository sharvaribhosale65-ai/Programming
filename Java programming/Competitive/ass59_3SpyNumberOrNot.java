//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   SpyNumber
//  Description     :   Check whether number is spy number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean SpyNumber(int iNo)  // 1124 = 1+1+2+4(8) = 1*1*2*4(8)
    {
        int iSum = 0;
        int iMult = 0;
        int iDigit = 0;

        iMult = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iMult = iMult*iDigit;
            iNo = iNo / 10;
        }

        if(iSum == iMult)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is automorphic number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass59_3SpyNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.SpyNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is spy number");
        }
        else
        {
            System.out.println("It is not spy number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   123
//  Output  :   It is spy number
//
//  Input   :   1125
//  Output  :   It is not spy number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
