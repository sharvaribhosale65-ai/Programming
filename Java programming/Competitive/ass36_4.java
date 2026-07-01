/*
Algorithm:
    START
        Accept one number as iNo
        Create masks for the 7th and 10th bits
        Combine both masks using OR operation
        Toggle the 7th and 10th bits using XOR operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : toggleBit
// Input         : int
// Output        : int
// Description   : Toggle the 7th and 10th bits of the given number
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int toggleBit(int iNo)
    {
        int iMask = 0, iMask1 = 0, iMask2 = 0, iAns = 0;

        iMask1 = 0x40;
        iMask2 = 0x200;

        iMask = iMask1 | iMask2;

        iAns = iNo ^ iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to toggle the 7th and 10th bits of the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass36_4
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
// Input  : 708
// Output : 132
//
// Input  : 134
// Output : 710
//
//////////////////////////////////////////////////////////////////////////////////////////////