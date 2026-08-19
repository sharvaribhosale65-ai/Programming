//Numbers and digits
//check whether harshad number or not - (18 / 9 = 2 means (1 + 8 = 9) completely divisible to 18)


import java.io.*;

public class program819
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;

        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp % iSum == 0)
        {
            System.out.println("It is harshad (niven) number");
        }
        else
        {
            System.out.println("It is not harshad (niven) number");
        }
    }    
}
