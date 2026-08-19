//Input : my name is amit
//output : ym eman si tima
//imp

import java.util.*;

class StringX
{
    public String WordReverse(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer FinalStr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
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

class program748
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        StringX strX = new StringX();
        String sRet = null;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        sRet = strX.WordReverse(str);

        System.out.println(sRet);

        sObj.close();
    }
}