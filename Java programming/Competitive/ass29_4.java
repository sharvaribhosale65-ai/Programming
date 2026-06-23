/*
Algorithm -
        START
            Accept character as ch
            Check it is in small case character or not 
            if TRUE
                print it is small case character
            else
                print it is not a small case character
        STOP        
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkSmall
// Input    :           String
// Output   :           boolean
// Description  :       Perform to Check it is small case character or not
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public boolean chkSmall(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 97 && Arr[i] <= 122)
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to Check it is small case character or not value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass29_4
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        boolean bRet = false;

        String data = null;

        System.out.println("Enter String : ");
        data = sObj.nextLine();

        bRet = strObj.chkSmall(data);

        if(bRet == true)
        {
            System.out.println("It is a small case character");
        }
        else
        {
            System.out.println("It is not a small case character");
        }
        sObj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   a
//OUTPUT    :   It is a small case character
//
//INPUT     :   H
//OUTPUT    :   It is not a small case character
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////