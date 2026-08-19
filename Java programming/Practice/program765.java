import java.util.*;

class program765
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        HashMap <Character, Integer> hObj = new HashMap<Character, Integer>();      // key, value

        hObj.put('a', 1);       //key ,value
        hObj.put('b', 1);      //key ,value
        hObj.put('a', 1);       //key ,value
        hObj.put('b', 1);       //key ,value

        System.out.println(hObj);
   }
}