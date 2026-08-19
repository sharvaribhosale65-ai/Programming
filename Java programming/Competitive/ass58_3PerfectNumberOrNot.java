//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   perfectNumber
//  Description     :   Check whether number is perfect number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean perfectNumber(int iNo)  //28 = 1+2+4+7+14
    {
        int i = 0;
        int iSum = 0;
        int iTemp = 0;

        iTemp = iNo;

        for(i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }    

        return iTemp == iSum;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is perfect number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass58_3PerfectNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.perfectNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is not perfect number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   12
//  Output  :   It is not perfect number
//
//  Input   :   28
//  Output  :   It is not perfect number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
