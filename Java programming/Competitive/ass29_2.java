/*
Algorithm :
    Accept character as str
    Check character is capital or not
    if true
        print It is capital character
    else
        print It is not a capital character    
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkCapital
// Input    :           String
// Output   :           boolean
// Description  :       Perform to Check it is capital character or not
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public boolean chkCapital(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 65 && Arr[i] <= 90)
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to Check it is capital character or not of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass29_2
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        boolean bRet = false;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        bRet = strObj.chkCapital(data);

        if(bRet == true)
        {
            System.out.println("It is capital character");
        }
        else
        {
            System.out.println("It is not a capital character");
        }
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   S
//OUTPUT    :   It is capital character
//
//INPUT     :   d
//OUTPUT    :   It is not a capital character
//
////////////////////////////////////////////////////////////////////////////////////////////////
