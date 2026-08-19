//Numbers and digits
//check whether armstrong number or not - (153 = 1^3 + 4^3 + 5^3 = 153)
//                                        (1534 = 1^4 + 4^4 + 5^4 + 4^4 = 1534)

//final

import java.io.*;

public class program817
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;
        int iCount = 0;

        int iTemp = 0;      //for backup

        int iDigit = 0;
        int iSum = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iTemp = iNo;   //backup

        while(iNo != 0)         // count the length of iNo
        {
            iCount++;
            iNo = iNo / 10;
        }
        
        iNo = iTemp;

        // 153 = 3^3 + 5^3 + 1^3

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + (int)Math.pow(iDigit, iCount);
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number");
        }
    }    
}
