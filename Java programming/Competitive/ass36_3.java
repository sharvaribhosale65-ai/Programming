/*
Algorithm:
    START
        Accept one number as iNo
        Create a mask for the 7th bit
        Toggle the 7th bit using XOR operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : toggleBit
// Input         : int
// Output        : int
// Description   : Toggle the 7th bit of the given number
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int toggleBit(int iNo)
    {
        int iMask = 0, iAns = 0;

        iMask = 0x40;

        iAns = iNo ^ iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to toggle the 7th bit of the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass36_3
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        iRet = bObj.toggleBit(iValue);

        System.out.println("Modified number is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 64
// Output : 0
//
// Input  : 132
// Output : 196
//
//////////////////////////////////////////////////////////////////////////////////////////////