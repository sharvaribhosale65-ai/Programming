//Numbers
//strong number or not

import java.io.*;

public class program802 
{
    public static void main(String A[]) throws Exception
    {
        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = Integer.parseInt(bObj.readLine());        //parseInt - convert string into integer
                                                        //readLine() - is used to read line of text
        System.out.println("input value is : "+iNo);
        
    }    
}
