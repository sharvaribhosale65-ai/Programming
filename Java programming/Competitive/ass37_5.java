/*
Algorithm:
    START
        Accept one number as iNo
        Create a mask for the first and last nibble
        Toggle the first and last nibble using XOR operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : toggleBit
// Input         : int
// Output        : int
// Description   : Toggle the first and last nibble of the given number
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int toggleBit(int iNo)
    {
        int iMask = 0, iAns = 0;

        iMask = 0xF000000F;

        iAns = iNo ^ iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to toggle the first and last nibble of the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass37_5
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
// Input  : -268435329
// Output : 112
//
// Input  : 127
// Output : -268435344
//
//////////////////////////////////////////////////////////////////////////////////////////////