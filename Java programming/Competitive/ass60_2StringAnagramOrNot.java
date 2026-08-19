/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   stringAnagram
/// Description     :   Check whether string is anagram or not.
/// Input           :   String
/// Output          :   boolean
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public boolean stringAnagram(String str1, String str2)
    {
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+", " ");
        str1 = str1.toLowerCase();
        char Arr[] = str1.toCharArray();
        int Frequency1[] = new int[26];


        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+", " ");
        str2 = str2.toLowerCase();
        char Brr[] = str2.toCharArray();
        int Frequency2[] = new int[26];

        for(i = 0; i < Brr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency1[Arr[i] - 97]++;
            }

            if(Brr[i] >= 'a' && Brr[i] <= 'z')
            {
                Frequency1[Brr[i] - 97]++;
            }
        }

        boolean bFlag = true;

        for(i = 0; i <= Frequency1.length; i++)
        {
            if(Frequency1.length != Frequency2.length)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check string is anagram or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass60_2StringAnagramOrNot 
{
    public static void main(String A[])   
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        boolean bRet = false;

        System.out.println("Enter first string : ");
        String str1 = sObj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sObj.nextLine();

        bRet = strObj.stringAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("It is anagram string");
        }
        else
        {
            System.out.println("It is not anagram string");
        }

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   madam   mmdaa
//  Output  :   It is anagram string
//
//  Input   :   hello   hellow
//  Output  :   It is not anagram string
//
//////////////////////////////////////////////////////////////////////////////////////////////////
