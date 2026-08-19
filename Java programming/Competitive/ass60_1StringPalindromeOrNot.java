/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   stringReverse
/// Description     :   Check whether string is palindrome or not.
/// Input           :   String
/// Output          :   boolean
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public boolean stringReverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);

        String revObj = sb.reverse().toString();

        if(str.equals(revObj))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to check string is palindrome or not
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass60_1StringPalindromeOrNot 
{
    public static void main(String A[])   
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        boolean bRet = false;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        bRet = strObj.stringReverse(str);

        if(bRet == true)
        {
            System.out.println("It is palindrome string");
        }
        else
        {
            System.out.println("It is not palindrome string");
        }

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   madam
//  Output  :   It is palindrome string
//
//  Input   :   hello
//  Output  :   It is not palindrome string
//
//////////////////////////////////////////////////////////////////////////////////////////////////
