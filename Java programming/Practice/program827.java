//Numbers and digits
//Automorphic number = whose square ends with exact same digit ( 5^2 = 25, 25^2 = 125)

import java.io.*;

public class program827

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

        iTemp = iNo;

        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDen = (int)Math.pow(10, iCount);

        if(iSquare % iDen == iTemp)
        {
            System.out.println("It is Automorphic number");
        }
        else
        {
            System.out.println("It is not Automorphic number");
        }
    }    
}
