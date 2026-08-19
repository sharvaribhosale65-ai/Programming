import java.util.*;

class program736
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        int iMax = 0;
        String temp = null;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();       

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");   

        System.out.println("Number of words : "+Tokens.length);


        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > iMax)
            {
                iMax = Tokens[i].length();
                temp = Tokens[i];
            }
            
        }
        System.out.println("Largest word is : " + temp + " having length : "+iMax);

    }
}