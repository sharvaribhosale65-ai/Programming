/*
Algorithm:
    START
        Accept one number as iNo
        Create masks for the first and last bits
        Combine both masks using OR operation
        Perform AND operation between iNo and the combined mask
        If the result is equal to the combined mask
            Display "First and last bits are ON"
        Else
            Display "First and last bits are OFF"
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : chkBit
// Input         : int
// Output        : boolean
// Description   : Check whether the first and last bits are ON or OFF
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

        iMask1 = 0x1;
        iMask2 = 0x80000000;

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
// Application to check whether the first and last bits are ON or OFF
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass35_5chkBits
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
            System.out.println("First and last bits are ON");
        }
        else
        {
            System.out.println("First and last bits are OFF");
        }
        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : -2147472895
// Output : First and last bits are ON
//
// Input  : -2147483648
// Output : First and last bits are OFF
//
//////////////////////////////////////////////////////////////////////////////////////////////