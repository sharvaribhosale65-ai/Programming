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

        if(Arr[0] >= 'a' && Arr[0] <= 'z')  //first letter of first word convert into capital
        {
            Arr[0] = (char)(Arr[0] - 32);
        }

        for(int i = 0; i < Arr.length; i++)
        {
        
            if(Arr[i] == ' ')
            {
                if(Arr[i + 1] >= 'a' && Arr[i + 1] <= 'z')
                {
                    Arr[i + 1] = (char)(Arr[i + 1] - 32);
                }
            }
        }

        String output = new String(Arr);
        System.out.println("Updated string is : "+output);
        sObj.close();
    }
}