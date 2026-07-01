/*
Algorithm:
    START
        Accept one number as iNo
        Accept one position as iPos
        Create a mask
        Shift the mask to the given position
        Toggle the bit at the given position using XOR operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : toggleBit
// Input         : int, int
// Output        : int
// Description   : Toggle the bit at the given position
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int toggleBit(int iNo, int iPos)
    {
        int iMask = 0, iAns = 0;

        iMask = 0x1;
        iMask = iMask << (iPos - 1);

        iAns = iNo ^ iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to toggle the bit at the given position
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass37_4
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0, iLocation = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        System.out.println("Enter the position : ");
        iLocation = sObj.nextInt();

        iRet = bObj.toggleBit(iValue, iLocation);

        System.out.println("Modified number is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 10  3
// Output : 14
//
// Input  : 100  5
// Output : 116
//
//////////////////////////////////////////////////////////////////////////////////////////////