/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   characterFrequency
/// Description     :   Print the frequency of each character.
/// Input           :   String
/// Output          :   String
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public String characterFrequency(String str)
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
                Frequency[Arr[i]-97]++;
            }
        }

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] > 0)
            {
                sRet = sRet + (char)(i + 97) + " : " + Frequency[i] + "\n";
            }
        }

        return sRet;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to print frequency of each character.
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass60_5PrintCharacterFreq 
{
    public static void main(String A[])   
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        String strRet = "";

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        strRet = strObj.characterFrequency(str);

        System.out.println("Frequency of each character : ");
        System.out.println(strRet);

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   Jay ganesh
//  Output  :   a : 2
//              e : 1
//              g : 1
//              h : 1
//              j : 1
//              n : 1
//              s : 1
//              y : 1
//
//////////////////////////////////////////////////////////////////////////////////////////////////
