//anagram
//imp

import java.util.*;

class program756
{
    public static boolean checkAnagram(String str1, String str2)
    {

        return true;
    }
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        boolean bret = false;
        int i = 0;

        System.out.println("Enter first string : ");
        String str1 = sObj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sObj.nextLine();

        bret = checkAnagram(str1, str2);

        if(bret == true)
        {
            System.out.println("Strings are anagram");
        }

        else
        {
            System.out.println("Strings are not anagram");
        }
        sObj.close();
    }
}