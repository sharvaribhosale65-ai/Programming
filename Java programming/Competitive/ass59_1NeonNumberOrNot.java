//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   NeonNumber
//  Description     :   Check whether number is neon number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean NeonNumber(int iNo)  // 9^2 = 81 ( 81 = 8+1 = 9)
    {
        int iSum = 0;
        int iCount = 0;
        int iDigit = 0;
        int iTemp = 0;

        iTemp = iNo;

        iCount = iNo * iNo;

        while(iCount != 0)
        {
            iDigit = iCount % 10;
            iSum = iSum + iDigit;
            iCount = iCount / 10; 
        }
        return iTemp == iSum;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is neon number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass59_1NeonNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.NeonNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is neon number");
        }
        else
        {
            System.out.println("It is not neon number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   9
//  Output  :   It is neon number
//
//  Input   :   12
//  Output  :   It is not neon number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
