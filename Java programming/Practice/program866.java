

import java.util.*;

class program866
{
    public static void main(String A[])
    {
        TreeMap<Integer, String> hObj = new TreeMap<Integer, String>();     //TreepMap and HashMap inherits from Map interface

        hObj.put(20, "C Programming");
        hObj.put(10, "Java Programming");   
        hObj.put(30, "C Programming");

        System.out.println(hObj);

        System.out.println(hObj.firstKey());
        System.out.println(hObj.lastKey());

        System.out.println(hObj.firstEntry());      //display first key - value
        System.out.println(hObj.lastEntry());      //display last key - value

        System.out.println(hObj.higherKey(20));       //Display key which is Greater than 20
        System.out.println(hObj.lowerKey(20));       //Display key which is less than 20
    }
}
