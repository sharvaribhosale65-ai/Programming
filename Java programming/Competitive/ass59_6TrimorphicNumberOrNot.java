//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   TrimorphicNumber
//  Description     :   Check whether number is trimorphic number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean TrimorphicNumber(int iNo)  // 4^3 = 64 = ends with 4
    {
        int iCount = 0;
        int iCube = 0;
        int iTemp = 0;
        int iDen = 0;

        iTemp = iNo;

        iCube = iNo * iNo *  iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDen = (int)Math.pow(10, iCount);

        if(iCube % iDen == iTemp)
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
//  Entry point function to check it is trimorphic number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass59_6TrimorphicNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.TrimorphicNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is trimorphic number");
        }
        else
        {
            System.out.println("It is not trimorphic number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   4
//  Output  :   It is trimorphic number
//
//  Input   :   7
//  Output  :   It is not trimorphic number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
