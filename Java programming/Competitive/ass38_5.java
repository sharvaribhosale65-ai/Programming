/*
Algorithm:
    START
        Accept one number as iNo
        Accept start position and end position
        Create a mask for all bits in the given range
        Toggle all bits in the given range using XOR operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : ToggleBitRange
// Input         : int, int, int
// Output        : int
// Description   : Toggle all bits in the specified range
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int ToggleBitRange(int iNo, int iStart, int iEnd)
    {
        int iMask = 0, i = 0, iAns = 0;

        for(i = iStart; i <= iEnd; i++)
        {
            iMask = iMask | (1 << (i - 1));
        }

        iAns = iNo ^ iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to toggle all bits in the specified range
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass38_5
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0, iPos1 = 0, iPos2 = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        System.out.println("Enter start position : ");
        iPos1 = sObj.nextInt();

        System.out.println("Enter end position : ");
        iPos2 = sObj.nextInt();

        iRet = bObj.ToggleBitRange(iValue, iPos1, iPos2);

        System.out.println("Toggle of range is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 97  2  5
// Output : 127
//
//////////////////////////////////////////////////////////////////////////////////////////////