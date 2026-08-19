import java.util.*;

class program779
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

        int iCount = 0;

        for(String s : Tokens)
        {
            if(hObj.containsKey(s))
            {
                iCount = hObj.get(s);

                hObj.put(s, iCount + 1);
            }
            else
            {
                hObj.put(s, 1);
            }
        }
        System.out.println(hObj);
    }
}