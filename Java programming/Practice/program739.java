import java.util.*;

class program739
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        String temp = null;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();       

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");   

        System.out.println("Number of words : "+Tokens.length);

        temp = Tokens[0];       //copy first word length into temp

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > temp.length())
            {
                temp = Tokens[i];
            }
            
        }
        System.out.println("Largest word is : " + temp + " having length : "+temp.length());

    }
}