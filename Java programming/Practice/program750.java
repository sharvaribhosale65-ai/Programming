//Input : india is my country i live in india
//output : bharat is my country i live in bharat

import java.util.*;

class program750
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        int iCount = 0;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india") == true)
            {
                iCount++;
            }
        }

        System.out.println("frequency of word is : "+iCount);

        sObj.close();
    }
}