/*
Algorithm:
    START
        Accept a string as str
        Display it in reverse order
        Display result
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Reverse
// Input    :           String
// Output   :           void
// Description  :       Display it in reverse order
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public void Reverse(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = Arr.length - 1; i >= 0; i--)
        {
            System.out.print(Arr[i]);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Display it in reverse order of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass31_5
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        strObj.Reverse(data);

        sObj.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////
/// 
/// INPUT   :   MarvellouS
/// OUTPUT  :   SuollevraM
///
/// INPUT   :   Hello
/// OUTPUT  :   olleH
///  
//////////////////////////////////////////////////////////////////////////////////////// 