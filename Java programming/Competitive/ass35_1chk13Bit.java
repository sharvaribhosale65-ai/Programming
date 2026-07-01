/*
Algorithm:
    START
        Accept one number as iNo
        Create a mask for the 15th bit (0x4000)
        Perform AND operation between iNo and the mask
        If the result is equal to the mask
            Display "15th bit is ON"
        Else
            Display "15th bit is OFF"
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkbit
// Input    :           int 
// Output   :           boolean
// Description  :       Perform AND operation between iNo and the mask
// Date :               01/07/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public boolean chkbit(int iNo)
    {
        int iMask = 0X4000;

        int iAns = iNo & iMask;

        if(iAns == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Perform AND operation between iNo and the mask of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass35_1chk13Bit
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        bRet = bObj.chkbit(iValue);

        if(bRet == true)
        {
            System.out.println("15th bit is on");
        }
        else
        {
            System.out.println("15th bit is off");
        }
        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   16436
//Output    :   15th bit is on
//
//Input     :   98
//Output    :   15th bit is off
//
//////////////////////////////////////////////////////////////////////////////////////////////