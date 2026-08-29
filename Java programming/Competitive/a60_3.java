import java.util.*;
import java.io.*;

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file:");
        String Source = sobj.nextLine();

        System.out.println("Enter destination file:");
        String Destination = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(Source);
            FileOutputStream fout = new FileOutputStream(Destination);

            byte Buffer[] = new byte[1024];

            int i = 0;

            while((i = fin.read(Buffer)) != -1)
            {
                fout.write(Buffer, 0, i);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully");
        }
        catch(Exception e)
        {
            System.out.println("Unable to copy file");
        }
    }
}