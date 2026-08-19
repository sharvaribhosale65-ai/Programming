//get()
//put()
//keyset()
//containskey()

import java.util.*;

class program773
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        HashMap <Character, Integer> hObj = new HashMap<Character, Integer>();      // key, value

        System.out.println("Enter string :");
        String str = sObj.nextLine();

        char Arr[] = str.toCharArray();

        int iCount = 0;

        for(char ch : Arr)          //foreach  ch - key
        {
            if(hObj.containsKey(ch))
            {
                iCount = hObj.get(ch);

                hObj.put(ch, iCount+1);
            }

            else
            {
                hObj.put(ch, 1);

            }
        }

        System.out.println(hObj);
   }
}