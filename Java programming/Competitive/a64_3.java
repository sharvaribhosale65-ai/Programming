import java.io.*;
import java.util.*;

class FileCreate
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String name = sobj.nextLine();

        try
        {
            File fobj = new File(name);

            if(fobj.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file");
        }
    }
}