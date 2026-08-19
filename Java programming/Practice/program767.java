import java.util.*;

//hashtable : synchronised - slow
//hashpmap  : non synchronised - faster than synchronised


class program767
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        Hashtable <Character, Integer> hObj = new Hashtable<Character, Integer>();      // key, value

        hObj.put('a', 1);       //key ,value
        hObj.put('b', 1);      //key ,value
        hObj.put('a', 2);       //key ,value
        hObj.put('b', 2);       //key ,value

        System.out.println(hObj);
   }
}