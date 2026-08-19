import java.util.*;

class program783
{
    public static void main(String A[])
    {
        HashMap<String, Integer> hObj = new HashMap<String, Integer>();

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        for(String s : Tokens)
        {
            if(hObj.containsKey(s))
            {
                hObj.get(s);

                hObj.put(s, (hObj.get(s) + 1));
            }
            else
            {
                hObj.put(s, 1);
            }
        }

        int iMax = 0;
        String temp = null;

        for(String sValue : hObj.keySet())
        {
            if(hObj.get(sValue) > iMax)
            {
                iMax = hObj.get(sValue);
                temp = sValue;
            }
        }
        System.out.println(temp + " is maximum occured word with frequency : " + iMax);
    }
}