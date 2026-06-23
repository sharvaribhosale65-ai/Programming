/*
Algorithm -
        START
            Accept character as ch
            Check it is character or not 
            if TRUE
                print it is character
            else
                print it is not character
        STOP        
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkAlpha
// Input    :           String
// Output   :           boolean
// Description  :       Perform to Check it is character or not
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public boolean chkAlpha(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();                     

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 65 && Arr[i] <= 90) || (Arr[i] >= 97 && Arr[i] <= 122))
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to check it is character or not of string value 
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass29_1
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        boolean bRet = false;

        String data = null;

        System.out.println("Enter string: ");
        data = sObj.nextLine();

        bRet = strObj.chkAlpha(data);

        if(bRet == true)
        {
            System.out.println("It is character");
        }
        else
        {
            System.out.println("It is not a chracter");
        }
        sObj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   S
//OUTPUT    :   It is character
//
//INPUT     :   &
//OUTPUT    :   It is not a character
//
////////////////////////////////////////////////////////////////////////////////////////////////



























