/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Import required libraries
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Function name   :   ReverseWord
/// Description     :   Reverse each word of sentence.
/// Input           :   String
/// Output          :   String
/// Author          :   Sharvari Gorakhnath Bhosale
/// Date            :   19.08.2026
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public String ReverseWord(String str)
    {
        int i = 0;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer FinalStr = new StringBuffer(" ");

        for(i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();

            FinalStr = FinalStr.append(sb);
            FinalStr = FinalStr.append(" ");
        }
        String output = new String(FinalStr);

        output = output.trim();

        return output;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function to reverse each word of sentence.
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class ass61_1ReverseWord 
{
    public static void main(String A[])   
    {
        Scanner sObj = new Scanner(System.in);
        StringX strObj = new StringX();
        String strRet = "";

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        strRet = strObj.ReverseWord(str);

        System.out.println("Reverse words are : ");
        System.out.print(strRet +"\t");

        sObj.close();
    } 
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   Java      is Powerful
//  Output  :   avaJ si lufrewoP
//
//////////////////////////////////////////////////////////////////////////////////////////////////
