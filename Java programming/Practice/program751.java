//Input : india is my country i live in india
//output : bharat is my country i live in bharat

import java.util.*;

class program751
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer FinalStr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india") == true)
            {
                FinalStr = FinalStr.append("bharat");   //replace from india to bharat
                FinalStr = FinalStr.append(" ");

                continue;   //Stop the current iteration and go directly to the next iteration of the loop.
            }
            FinalStr = FinalStr.append(Tokens[i]);      //append all words as it is
            FinalStr = FinalStr.append(" ");
        }

        String output = new String(FinalStr);

        output = output.trim();

        System.out.println(output);
        
        sObj.close();
    }
}