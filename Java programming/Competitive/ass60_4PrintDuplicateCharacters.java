/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   duplicateCharcaters
/// Description     :   Check whether character is duplicate or not.
/// Input           :   String
/// Output          :   String
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public String duplicateCharcaters(String str)
    {
        int i = 0;
        String sRet = "";

        str = str.trim();
        str = str.replaceAll("\\s+", " ");
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
            if(Frequency[i] > 1)
            {
                sRet = sRet + (char)(i+97) + " ";
            }
        }
        return sRet;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check charcter is duplicate or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass60_4PrintDuplicateCharacters 
{
    public static void main(String A[])   
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        String strRet = "";

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        strRet = strObj.duplicateCharcaters(str);

        if(strRet.length() > 0)
        {
            System.out.println("Duplicates characters are : "+strRet);
        }
        else
        {
            System.out.println("There are no such duplicate charcters");
        }

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   hello world
//  Output  :   Duplicates characters are : l o
//
//  Input   :   Ganesh
//  Output  :   There are no such duplicate charcters
//
//////////////////////////////////////////////////////////////////////////////////////////////////
