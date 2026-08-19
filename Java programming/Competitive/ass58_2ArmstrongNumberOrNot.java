//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name   :   ArmstrongNumber
//  Description     :   Check whether number is armstrong number or not.
//  Input           :   int
//  Output          :   boolean
//  Author          :   Sharvari Gorakhnath Bhosale
//  Date            :   18.08.2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    public boolean ArmstrongNumber(int iNo)  //153 = 1^3 + 5^3 + 3^3
    {

        int iCount = 0;
        int iDigit = 0;
        int iSum = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum =  iSum + (iDigit * iCount);
            iNo = iNo / 10;
        }
        return iTemp == iSum;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check it is armstrong number or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass58_2ArmstrongNumberOrNot
{
    public static void main(String A[]) throws Exception
    {
        NumberX nObj = new NumberX();
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        boolean bRet = false;

        System.out.println("Enter the number : ");
        int iNo = Integer.parseInt(bObj.readLine());    //Convert string into integer
        
        bRet = nObj.ArmstrongNumber(iNo);

        if(bRet ==true)
        {
            System.out.println("It is Armstrong number");
        }
        else
        {
            System.out.println("It is not Armstrong number");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   153
//  Output  :   It is  Armstrong  number
//
//  Input   :   456
//  Output  :   It is not  Armstrong  number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
