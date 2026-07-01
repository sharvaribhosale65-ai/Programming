/*
Algorithm:
    START
        Accept one number as iNo
        Create a mask for the first 4 bits
        ON the first 4 bits using OR operation
        Return the modified number
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : onBit
// Input         : int
// Output        : int
// Description   : Turn ON the first 4 bits of the given number
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int onBit(int iNo)
    {
        int iMask = 0, iAns = 0;

        iMask = 0xF;

        iAns = iNo | iMask;

        return iAns;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to turn ON the first 4 bits of the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass36_5
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iRet = 0;
        int iValue = 0;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        iRet = bObj.onBit(iValue);

        System.out.println("Modified number is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 128
// Output : 143
//
// Input  : 15
// Output : 15
//
//////////////////////////////////////////////////////////////////////////////////////////////