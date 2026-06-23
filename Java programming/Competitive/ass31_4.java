/*
Algorithm :
    START
        Accept a string as str
        Check it contains vowels in it or not
        Display result
*/
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkVowel
// Input    :           String
// Output   :           boolean
// Description  :       Check it contains vowels in it or not
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public boolean chkVowel(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'A' || Arr[i] == 'E' || Arr[i] == 'I' || Arr[i] == 'O' || Arr[i] == 'U'
            || Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u')
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Check it contains vowels in it or not of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass31_4
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        boolean bRet = false;

        bRet = strObj.chkVowel(data);

        if(bRet == true)
        {
            System.out.println("It contains a vowel");
        }
        else
        {
            System.out.println("It does not contains a vowel");
        }
        sObj.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// INPUT   :   marvellous
/// OUTPUT  :   It contains a vowel
/// 
/// INPUT   :   DEMO
/// OUTPUT  :   It contains a vowel
/// 
/// INPUT   :   xyz
/// OUTPUT  :   It does not contains a vowel
/// 
///////////////////////////////////////////////////////////////////////////////////////////// 