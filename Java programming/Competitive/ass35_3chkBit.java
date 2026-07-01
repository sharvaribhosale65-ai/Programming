/*
Algorithm:
    START
        Accept one number as iNo
        Create masks for the 7th, 15th, 21st and 28th bits
        Combine all masks using OR operation
        Perform AND operation between iNo and the combined mask
        If the result is equal to the combined mask
            Display "7th, 15th, 21st and 28th bits are ON"
        Else
            Display "7th, 15th, 21st and 28th bits are OFF"
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : chkBit
// Input         : int
// Output        : boolean
// Description   : Check whether the 7th, 15th, 21st and 28th bits are ON or OFF
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public boolean chkBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0, iMask3 = 0, iMask4 = 0;
        int iAns = 0;

        iMask1 = 0x40;
        iMask2 = 0x4000;
        iMask3 = 0x100000;
        iMask4 = 0x8000000;

        iMask = iMask1 | iMask2 | iMask3 | iMask4;

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
// Application to check whether the 7th, 15th, 21st and 28th bits are ON or OFF
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass35_3chkBit
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
            System.out.println("7th, 15th, 21st, 28th bits are ON");
        }
        else
        {
            System.out.println("7th, 15th, 21st, 28th bits are OFF");
        }
        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 135282752
// Output : 7th, 15th, 21st, 28th bits are ON
//
// Input  : 134234176
// Output : 7th, 15th, 21st, 28th bits are OFF
//
//////////////////////////////////////////////////////////////////////////////////////////////