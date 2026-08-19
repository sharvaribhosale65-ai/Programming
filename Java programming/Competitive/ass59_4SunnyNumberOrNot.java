//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   SunnyNumber
//  Description     :   Check whether number is sunny number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean SunnyNumber(int iNo)  // 3 = 3+1 (4) = 4 is a square
    {
        int i = 0;

        iNo = iNo + 1;
        for(i = 0; i * i <= iNo; i++)
        {
            if(i * i == iNo)
            {
                return true;
            }
        }
        return false;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is sunny number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass59_4SunnyNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.SunnyNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is sunny number");
        }
        else
        {
            System.out.println("It is not sunny number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   3
//  Output  :   It is sunny number
//
//  Input   :   10
//  Output  :   It is not sunny number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
