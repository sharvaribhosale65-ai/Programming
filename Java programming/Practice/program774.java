//get()
//put()
//keyset()
//containskey()

import java.util.*;

class program774
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        HashMap <Character, Integer> hObj = new HashMap<Character, Integer>();      // key, value

        System.out.println("Enter string :");
        String str = sObj.nextLine();

        char Arr[] = str.toCharArray();

        int iCount = 0;

        for(char ch : Arr)          //foreach
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

        for(char cValue : hObj.keySet())  //stores letter one by one in cvalue
        {
            System.out.println(cValue + " occurs " + hObj.get(cValue) + " times.");
        }
   }
}