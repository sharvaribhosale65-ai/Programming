

import java.util.*;

class program864
{
    public static void main(String A[])
    {
        TreeMap<Integer, String> hObj = new TreeMap<Integer, String>();     //TreepMap and HashMap inherits from Map interface

        hObj.put(20, "C Programming");
        hObj.put(10, "Java Programming");   
        hObj.put(30, "C Programming");
        hObj.put(10, "Java Programming");  
        hObj.put(30, "C Programming");

        System.out.println(hObj);
    }
}
