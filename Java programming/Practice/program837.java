//Arraylist - contains array and linked list
//maintain sequence, allows duplicate

import java.util.*;

class program837
{
    public static void main(String A[])
    {
        ArrayList <String> aObj = new ArrayList <String> ();

        aObj.add("Pune");
        aObj.add("Mumbai");
        aObj.add("Satara");
        aObj.add("Nashik");
        aObj.add("Mumbai");

        if(aObj.contains("Satara"))
        {
            System.out.println("Satara is present in arraylist");   //case sensitive
        }
    }
}