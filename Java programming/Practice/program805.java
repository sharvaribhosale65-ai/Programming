//Numbers and digits
//strong number or not - (145 = 1! + 4! + 5!)
//factorial

import java.io.*;

public class program805
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;
        int iFact = 0;
        int i = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iFact = 1;

        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }

        System.out.println("Factorial is : "+iFact);
    }    
}
