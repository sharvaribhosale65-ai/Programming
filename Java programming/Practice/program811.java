//Numbers and digits
//check whether strong number or not - (145 = 1! + 4! + 5!)
//factorial
//optimize

import java.io.*;

public class program811
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        int iNo = 0;

        int iTemp = 0;      //backup
        long iSum = 0;
        int iDigit = 0;

        int iFact[] = {1, 1, 2, 6, 24, 120, 320, 5040, 40320, 362880};      //Factorials of 0 - 9 digits


        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iFact[iDigit];
            iNo = iNo / 10;

            if(iSum > iTemp)
            {
                break;
            }
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
