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

        sObj.close();
    }
}