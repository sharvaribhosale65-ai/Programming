//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   DisariumNumber
//  Description     :   Check whether number is disarium number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean DisariumNumber(int iNo)  // 135 = 1^1 + 3^2 + 5^3 = 135
    {
        int iCount = 0;
        int iSum = 0;
        int iTemp = 0;
        int iDigit = 0;
        int i = 0;
        int iPower = 0;

        iTemp = iNo;

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;

            iPower = 1;

            for(i = 1; i <= iCount; i++)
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;
            iCount--;
            iTemp = iTemp / 10;
        }

        if(iNo == iSum)
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
//  Entry point function to check it is disarium number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass59_5DisariumNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.DisariumNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is disarium number");
        }
        else
        {
            System.out.println("It is not disarium number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   135
//  Output  :   It is disarium number
//
//  Input   :   81
//  Output  :   It is not disarium number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
