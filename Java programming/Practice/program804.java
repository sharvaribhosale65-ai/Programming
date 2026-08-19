//Numbers and digits
//strong number or not - 145 = 1! + 4! + 5!

import java.io.*;

public class program804
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        System.out.println("input value is : "+iNo);

        int iDigit = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
        System.out.println("Original number is : "+iTemp);
    }    
}
