/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   pangramString
/// Description     :   Check whether string is pangram or not.
/// Input           :   String
/// Output          :   boolean
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public boolean pangramString(String str)
    {
        int i = 0;
        boolean bFlag = true;

        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        str = str.toLowerCase();
        char Arr[] = str.toCharArray();
        int Frequency[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
           if(Arr[i] >= 'a' && Arr[i] <= 'z')
           {
                Frequency[(int)Arr[i] - 97]++;
           }
        }

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] == 0)
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
//  Entry point function to check string is pangram or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass60_3PangramStringOrNot 
{
    public static void main(String A[])   
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        boolean bRet = false;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        bRet = strObj.pangramString(str);

        if(bRet == true)
        {
            System.out.println("It is pangram string");
        }
        else
        {
            System.out.println("It is not pangram string");
        }

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   The quick brown fox jumps over the lazy dog
//  Output  :   It is pangram string
//
//  Input   :   hello world
//  Output  :   It is not pangram string
//
//////////////////////////////////////////////////////////////////////////////////////////////////
