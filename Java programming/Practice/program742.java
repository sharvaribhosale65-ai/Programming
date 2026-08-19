//camel case

// input : my name is amit
// output : My Name Is Amit

// input : my NAME is AmIT
// output : My Name Is Amit

import java.util.*;

class program740
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        String temp = null;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();       

        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();
        System.out.println(str);

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
        
            if(Arr[i] == ' ')
            {
                if(Arr[i + 1] >= 'a' && Arr[i + 1] <= 'z')      //check

                {
                    Arr[i + 1] = (char)(Arr[i + 1] - 32);       // -32 means convert it into capital
                }
            }
        }

        String output = new String(Arr);
        System.out.println("Updated string is : "+output);
        sObj.close();
    }
}