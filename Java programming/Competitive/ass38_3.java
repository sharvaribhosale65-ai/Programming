/*
Algorithm:
    START
        Accept one number as iNo
        Create masks for the 9th and 12th bits
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
// Input         : int
// Output        : boolean
// Description   : Check whether the 9th or 12th bit is ON or OFF
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public boolean chkBits(int iNo)
    {
        int iMask1 = 0x1, iMask2 = 0x1, iMask = 0, iAns = 0;

        iMask1 = iMask1 << 8;
        iMask2 = iMask2 << 11;

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
// Application to check whether the 9th or 12th bit is ON or OFF
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass38_3
{
    public static void main(String[] args)
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        bRet = bObj.chkBits(iValue);

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
// Input  : 257
// Output : True
//
// Input  : 97
// Output : False
//
//////////////////////////////////////////////////////////////////////////////////////////////