/*
Algorithm:
    START
        Accept one number as iNo
        Initialize count as 0
        Repeat until iNo becomes 0
            Check whether the last bit is ON
            If it is ON
                Increment the count
            Shift iNo one bit to the right
        Return the count
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : countBits
// Input         : int
// Output        : int
// Description   : Count the number of ON (1) bits in the given number
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public int countBits(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                iCount++;
            }

            iNo = iNo >> 1;
        }

        return iCount;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to count the number of ON (1) bits in the given number
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass38_1
{
    public static void main(String[] A)
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        iValue = sObj.nextInt();

        iRet = bObj.countBits(iValue);

        System.out.println("Count of 1's is : " + iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 25
// Output : 3
//
//////////////////////////////////////////////////////////////////////////////////////////////