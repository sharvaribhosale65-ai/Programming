//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   StrongNumber
//  Description     :   Check whether number is strong number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class StrongX
{
    public boolean StrongNumber(int iNo)
    {

        long iFact = 0;
        int iDigit = 0;
        long iSum = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iFact = 1;

            while(iDigit != 0)
            {
                iFact = iFact * iDigit;
                iDigit--;
            }
            iSum = iSum + iFact;

            iNo = iNo / 10;

            iFact = 1;
        }

        return iTemp == iSum;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is strong number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass58_1StrongNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        StrongX strObj = new StrongX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = strObj.StrongNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is strong number");
        }
        else
        {
            System.out.println("It is not strong number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   145
//  Output  :   It is strong number
//
//  Input   :   1456
//  Output  :   It is not strong number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
