//Numbers and digits
//check whether harshad number or not - (18 / 9 = 2 means (1 + 8 = 9) completely divisible to 18)


import java.io.*;

public class program820
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;

        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;

        int iStart = 0;
        int iEnd = 0;

        int i = 0;

        System.out.println("Enter the starting point : ");
        iStart = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        System.out.println("Enter the ending point : ");
        iEnd = Integer.parseInt(bObj.readLine()); 

        System.out.println("Harshad numbers are :");
        for(i = iStart; i <= iEnd; i++)
        {
            iNo = i;

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }

            if(i % iSum == 0)
            {
                System.out.println(i);
            }
            iSum = 0;
        }
        
    }    
}
