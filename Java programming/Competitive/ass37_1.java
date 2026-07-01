/*
Algorithm:
    START
        Accept one number as iNo
        Accept one position as iPos
        Create a mask
        Shift the mask to the given position
        Perform AND operation between iNo and the mask
        If the result is not equal to 0
            Return TRUE
        Else
            Return FALSE
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : chkBit
// Input         : int, int
// Output        : boolean
// Description   : Check whether the bit at the given position is ON or OFF
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public boolean chkBit(int iNo, int iPos)
    {
        int iMask = 0, iAns = 0;

        iMask = 0x1;

        iMask = iMask << (iPos - 1);

        iAns = iNo & iMask;

        if(iAns != 0)
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
// Application to check whether the bit at the given position is ON or OFF
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass37_1
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0, iLocation = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        System.out.println("Enter the position : ");
        iLocation = sObj.nextInt();

        bRet = bObj.chkBit(iValue, iLocation);

        if(bRet == true)
        {
            System.out.println("Bit is on");
        }
        else
        {
            System.out.println("Bit is off");
        }

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 10  2
// Output : Bit is on
//
// Input  : 89  3
// Output : Bit is off
//
//////////////////////////////////////////////////////////////////////////////////////////////