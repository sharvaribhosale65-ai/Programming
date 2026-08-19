//Input : my name is amit school name is abhinav city name is pune
//output : 3

import java.util.*;

class program749
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
            if(Tokens[i].equals("name") == true)
            {
                iCount++;
            }
        }

        System.out.println("frequency of word is : "+iCount);

        sObj.close();
    }
}