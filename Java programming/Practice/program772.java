//get()
//put()
//keyset()
//containskey()

import java.util.*;

class program772
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        //HashMap <Character, Integer> hObj = new HashMap<Character, Integer>();      // key, value

        System.out.println("Enter string :");
        String str = sObj.nextLine();

        char Arr[] = str.toCharArray();

        for(char ch : Arr)          //foreach    
        {
            System.out.println(ch);
        }
   }
}