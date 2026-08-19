//Numbers and digits
//strong number or not - (145 = 1! + 4! + 5!)
//factorial

import java.io.*;

public class program808
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;
        long iFact = 0;         //factorial is very long


        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iFact = 1;

        while(iNo != 0)
        {
            iFact = iFact * iNo;
            iNo--;
        }

        System.out.println("Factorial is : "+iFact);
    }    
}
