/*
Algorithm:
    START
        Accept one number as iNo
        Create masks for the 7th and 10th bits
        Combine both masks using OR operation
        Complement the mask
        OFF the 7th and 10th bits using AND operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : offBit
// Input         : int
// Output        : int
// Description   : Turn OFF the 7th and 10th bits of the given number if they are ON
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int offBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0;
        int iAns = 0;

        iMask1 = 0x40;
        iMask2 = 0x200;

        iMask = iMask1 | iMask2;

        iMask = ~iMask;

        iAns = iNo & iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to turn OFF the 7th and 10th bits of the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass36_2
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

        System.out.println("Modified number is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 577
// Output : 1
//
// Input  : 2048
// Output : 2048
//
//////////////////////////////////////////////////////////////////////////////////////////////