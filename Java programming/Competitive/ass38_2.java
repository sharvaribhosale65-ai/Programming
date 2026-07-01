/*
Algorithm:
    START
        Accept two numbers as iNo1 and iNo2
        Perform AND operation between both numbers
        Initialize position as 1
        Repeat until the result becomes 0
            Check whether the current bit is ON
            If it is ON
                Display the position
            Shift the result one bit to the right
            Increment the position
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : commonBits
// Input         : int, int
// Output        : void
// Description   : Display the positions of common ON bits from two numbers
// Date          : 01/07/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class BitwiseX
{
    public void commonBits(int iNo1, int iNo2)
    {
        int iAns = 0, iPos = 0;

        iAns = iNo1 & iNo2;
        iPos = 1;

        while(iAns != 0)
        {
            if((iAns & 1) == 1)
            {
                System.out.print(iPos + " ");
            }

            iAns = iAns >> 1;
            iPos++;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to display the positions of common ON bits from two numbers
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass38_2
{
    public static void main(String[] args)
    {
        Scanner sObj = new Scanner(System.in);

        BitwiseX bObj = new BitwiseX();

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter first number : ");
        iValue1 = sObj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sObj.nextInt();

        bObj.commonBits(iValue1, iValue2);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : 10 15
// Output : 2 4
//
//////////////////////////////////////////////////////////////////////////////////////////////