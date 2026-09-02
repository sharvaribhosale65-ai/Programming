//Arraylist - contains array and linked list
//maintain sequence, allows duplicate

import java.util.*;

class program835
{
    public static void main(String A[])
    {
        ArrayList <Integer> aObj = new ArrayList <Integer> ();

        aObj.add(11);
        aObj.add(21);
        aObj.add(51);
        aObj.add(101);
        aObj.add(51);

        aObj.remove(4);         //remove 51
        
        for(int No : aObj)                  //easy
        {
            System.out.println(No);     // 11 21 51 101
        }

        aObj.clear();

        System.out.println(aObj);       //[]
    }
}