//Arraylist - contains array and linked list
//maintain sequence, allows duplicate

import java.util.*;

class program836
{
    public static void main(String A[])
    {
        ArrayList <String> aObj = new ArrayList <String> ();

        aObj.add("Pune");
        aObj.add("Mumbai");
        aObj.add("Satara");
        aObj.add("Nashik");
        aObj.add("Mumbai");

        aObj.remove(4);         //remove Mumbai
        
        for(String No : aObj)                  
        {
            System.out.println(No);     
        }

        aObj.clear();

        System.out.println(aObj);       //[]
    }
}