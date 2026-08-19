//Input : india is my country i live in india
//output : bharat is my country i live in bharat

import java.util.*;

class program752
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];      //Array of 26 integer for (a to z)

        // a    b   c   d
        // 97   98  99  100
        // 0    1   2   3

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++;      //for b - (98 - 97)++ = (1)++ = (index of b is 1) 
                                                    //for d - (100 - 97)++ = (3)++ = (index of b is 3) 
            }
        }

        System.out.println("Frequency of each letter is : ");

        for(i = 0; i < Frequency.length; i++)
        {
            System.out.println(Frequency[i]);
        }

        sObj.close();
    }
}