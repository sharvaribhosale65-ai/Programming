//Numbers and digits
//check whether armstrong number or not - (153 = 1^3 + 4^3 + 5^3 = 153)
//                                        (1534 = 1^4 + 4^4 + 5^4 + 4^4 = 1534)

// x = 3 and y = 5  --> 3 ^ 5
//optimize

import java.io.*;

public class program816
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;
        int iCount = 0;

        int iTemp = 0;      //for backup

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        String str = String.valueOf(iNo);           //convert number into string
        System.out.println("Number of digits are : "+ str.length());
       
    }    
}
