//check

import java.util.*;

class program775
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

        int iMax = 0;
        char temp = '\0';
        
        for(char cValue : hObj.keySet())
        {
            if(hObj.get(cValue) > iMax)
            {
                iMax = hObj.get(cValue);        //get(cValue) - get key and display its value
                temp = cValue;
            }
        }
        System.out.println(temp + " occurs maximum times i.e. "+iMax);

   }
}