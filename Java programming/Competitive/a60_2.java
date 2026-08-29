import java.util.*;
import java.io.*;

class Program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name:");
        String Fname = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(Fname);

            int i = 0;

            System.out.println("File contents:");

            while((i = fin.read()) != -1)
            {
                System.out.print((char)i);
            }

            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to open file");
        }
    }
}