/*
Algorithm:
    START
        Accept one number as iNo
        Accept two positions as iPos1 and iPos2
        Create masks for both positions
        Combine both masks using OR operation
        Perform AND operation between iNo and the combined mask
        If the result is not equal to 0
            Return TRUE
        Else
            Return FALSE
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : chkBits
// Input         : int, int, int
// Output        : boolean
// Description   : Check whether the bit at the first position or the bit at the second position is ON
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public boolean chkBits(int iNo, int iLoc1, int iLoc2)
    {
        int iMask = 0, iMask1 = 0x1, iMask2 = 0x1, iAns = 0;

        iMask1 = iMask1 << (iLoc1 - 1);
        iMask2 = iMask2 << (iLoc2 - 1);

        iMask = iMask1 | iMask2;

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
// Application to check whether the bit at the first position or the bit at the second position is ON
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass38_4
{
    public static void main(String[] args)
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0, iPos1 = 0, iPos2 = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        System.out.println("Enter first position : ");
        iPos1 = sObj.nextInt();

        System.out.println("Enter second position : ");
        iPos2 = sObj.nextInt();

        bRet = bObj.chkBits(iValue, iPos1, iPos2);

        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 10  2  4
// Output : True
//
// Input  : 10  3  7
// Output : False
//
//////////////////////////////////////////////////////////////////////////////////////////////