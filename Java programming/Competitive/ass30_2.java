/*
ALGORITHM :

    START
        Accept a character as str
        If character is small:
            display its corresponding capital
        Else if character is capital:
            display its corresponding small
        Otherwise
            display as it is  
    STOP             
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Display
// Input    :           String
// Output   :           String
// Description  :       Perform the conditions
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public String Display(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 65 && Arr[i] <= 90)
            {
                Arr[i] = ((char)(Arr[i] + 32));
            }
            else if(Arr[i] >= 97 && Arr[i] <= 122)
            {
                Arr[i] = ((char)(Arr[i] - 32));
            }
            else
            {
                System.out.println(Arr[i]);
            }
        }
        return new String(Arr);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Perform the conditions of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass30_2
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        String sRet = null;

        sRet = strObj.Display(data);

        System.out.println("Updated string : "+sRet);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   a  
//OUTPUT    :   A
// 
//INPUT     :   M 
//OUTPUT    :   m
//
//INPUT     :   4  
//OUTPUT    :   4
//
/////////////////////////////////////////////////////////////////////////////////////////////////////