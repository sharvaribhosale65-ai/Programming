//Numbers and digits
//Automorphic number = whose square ends with exact same digit ( 5^2 = 25, 25^2 = 125)

import java.io.*;

public class program828

{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;

        int iTemp = 0;
        int iSquare = 0;
        int iCount = 0;

        int iDen = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        String strNo = String.valueOf(iNo);     //convert ino into string
        iCount = strNo.length();            //digit length

        iSquare = iNo * iNo;

        String strSquare = String.valueOf(iSquare);
        
        if(strSquare.endsWith(strNo))
        {
            System.out.println("It is automorphic number");
        }
        else
        {
            System.out.println("It is not automorphic number");
        }


    }    
}
