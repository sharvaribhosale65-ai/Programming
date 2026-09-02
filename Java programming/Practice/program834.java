//Arraylist - contains array and linked list
//maintain sequence, allows duplicate

import java.util.*;

class program834
{
    public static void main(String A[])
    {
        ArrayList <Integer> aObj = new ArrayList <Integer> ();

        aObj.add(11);
        aObj.add(21);
        aObj.add(51);
        aObj.add(101);
        aObj.add(51);

        for(int No : aObj)                  //easy
        {
            System.out.println(No);
        }
    }
}