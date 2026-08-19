/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   RemoveDuplicateCharacters
/// Description     :   Remove repeated characters while keeping first occurence.
/// Input           :   String
/// Output          :   String
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public String RemoveDuplicateCharacters(String str)
    {
        int i = 0;
        String sRet = "";
        //int iRet = 0;
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
                sRet = sRet + (char)(i+97);
            }
        }
        return sRet;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to Remove repeated characters while keeping first occurence.
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class  ass61_3RemoveDuplicateCharacters
{
    public static void main(String A[])  throws Exception
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        String strRet = "";
        //int iRet = 0;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        strRet = strObj.RemoveDuplicateCharacters(str);

        System.out.println("After removing the duplicate characters : " + strRet);

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   banana
//  Output  :   abn
//
//////////////////////////////////////////////////////////////////////////////////////////////////
