/*
Algorithm:
    START
        Accept one number as iNo
        Create masks for the 13th bit (0x1000) and 18th bit (0x20000)
        Combine both masks using OR operation
        Perform AND operation between iNo and the combined mask
        If the result is equal to the combined mask
            Display "13th and 18th bits are ON"
        Else
            Display "13th and 18th bits are OFF"
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : chkBit
// Input         : int
// Output        : boolean
// Description   : Check whether both 13th and 18th bits are ON or OFF
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public boolean chkBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0;
        int iAns = 0;

        iMask1 = 0x1000;
        iMask2 = 0x20000;
        iMask = iMask1 | iMask2;
        iAns = iNo & iMask;

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
// Application to check whether both 13th and 18th bits are ON or OFF
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass35_2chk13and18Bit
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        bRet = bObj.chkBit(iValue);

        if(bRet == true)
        {
            System.out.println("13th and 18th bits are ON");
        }
        else
        {
            System.out.println("13th and 18th bits are OFF");
        }
        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 135168
// Output : 13th and 18th bits are ON
//
// Input  : 6789
// Output : 13th and 18th bits are OFF
//
//////////////////////////////////////////////////////////////////////////////////////////////