//Input : my name is amit
//output : ym eman si tima
//imp

import java.util.*;

class program746
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

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

        System.out.println(output);

        sObj.close();
    }
}