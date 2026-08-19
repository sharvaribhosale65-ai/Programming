//Numbers and digits
//palindrome or not

import java.io.*;

public class program822
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;
        int iDigit = 0;
        int iTemp = 0;
        int iRev = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iRev = (iRev * 10) + iDigit;

            iNo = iNo / 10;
        }

        if(iTemp == iRev)
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }    
}
