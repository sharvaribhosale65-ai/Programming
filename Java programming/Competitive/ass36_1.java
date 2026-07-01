/*
Algorithm:
    START
        Accept one number as iNo
        Create a mask for the 7th bit
        Complement the mask
        OFF the 7th bit using AND operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : offBit
// Input         : int
// Output        : int
// Description   : Turn OFF the 7th bit of the given number if it is ON
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int offBit(int iNo)
    {
        int iMask = 0, iAns = 0;

        iMask = 0x40;

        iMask = ~iMask;

        iAns = iNo & iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to turn OFF the 7th bit of the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass36_1
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();
        int iRet = 0;

        int iValue = 0;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        iRet = bObj.offBit(iValue);

        System.out.println("Updated number is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 580
// Output : 516
//
// Input  : 516
// Output : 516
//
//////////////////////////////////////////////////////////////////////////////////////////////