//Numbers and digits
//check whether strong number or not - (145 = 1! + 4! + 5!)
//factorial

import java.io.*;

public class program809
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;
        long iFact = 0;         //factorial is evry long
        int iTemp = 0;      //backup
        long iSum = 0;
        int iDigit = 0;


        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iTemp = iNo;
        iFact = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            while(iDigit != 0)
            {
                iFact = iFact * iDigit;     //calculate factorial of each digit
                iDigit--;
            }
            iSum = iSum + iFact;
            
            iNo = iNo / 10;
        }

        System.out.println("Summation of factorial is : "+iSum);

        if(iTemp == iSum)
        {
            System.out.println("It is strong number");
        }

        else
        {
            System.out.println("It is not strong number");
        }

    }    
}
