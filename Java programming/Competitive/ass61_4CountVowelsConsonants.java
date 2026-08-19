/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   CountVowelsConsonants
/// Description     :   Count total vowels and consonants separately.
/// Input           :   String
/// Output          :   String
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public String CountVowelsConsonants(String str)
    {
        int i = 0;
        //String sRet = "";
        int iRet = 0;
        int bRet = 0;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        char Arr[] = str.toCharArray();
        int Frequency[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[Arr[i] - 97]++;
            }
        }

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] > 0)
            {
                if((char)(i+97) == 'a' || (char)(i+97) == 'e' || (char)(i+97) == 'i' || 
                    (char)(i+97) == 'o' || (char)(i+97) == 'u')
                {
                    iRet = iRet + Frequency[i];
                }
                else
                {
                    bRet = bRet + Frequency[i];
                }
            }
        }
        return "Vowels : " + iRet + ", Consonants : " + bRet;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to Count total vowels and consonants separately.
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class  ass61_4CountVowelsConsonants
{
    public static void main(String A[])  throws Exception
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        String strRet = "";
        //int iRet = 0;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        strRet = strObj.CountVowelsConsonants(str);

        System.out.println(strRet);

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   education
//  Output  :   Vowels : 5, Consonants : 4
//
//////////////////////////////////////////////////////////////////////////////////////////////////
