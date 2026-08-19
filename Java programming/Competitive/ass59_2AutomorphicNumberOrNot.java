//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   AutomorphicNumber
//  Description     :   Check whether number is automorphic number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean AutomorphicNumber(int iNo)  // 25^2 = 625 = ends with 25
    {
        int iSquare = 0;
        int iTemp = 0;
        int iCount = 0;
        int iDen = 0;

        iTemp = iNo;
        
        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDen = (int)Math.pow(10, iCount);

        if(iSquare % iDen == iTemp)
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

class ass59_2AutomorphicNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.AutomorphicNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is automorphic number");
        }
        else
        {
            System.out.println("It is not automorphic number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   6
//  Output  :   It is automorphic number
//
//  Input   :   7
//  Output  :   It is not automorphic number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
