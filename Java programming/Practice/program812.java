//Numbers and digits
//check whether armstrong number or not - (153 = 1^3 + 4^3 + 5^3 = 153)
//                                        (1534 = 1^4 + 4^4 + 5^4 + 4^4 = 1534)

// x = 3 and y = 5  --> 3 ^ 5

import java.io.*;

public class program812
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int x = 0;
        int y = 0;

        int iPower = 0;
        int i = 0;

        System.out.println("Enter the number as a base: ");
        x = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        System.out.println("Enter the number as a power: ");
        y = Integer.parseInt(bObj.readLine()); 

        iPower = 1;

        for(i = 1; i <= y; i++)
        {
            iPower = iPower * x;
        }

        System.out.println("Result is : "+iPower);
       
    }    
}
