import java.io.*;
import java.util.*;

class Program1
{
    public static void Display(String Path)
    {
        File fobj = new File(Path);

        if(fobj.exists())
        {
            File Arr[] = fobj.listFiles();

            System.out.println("Files and Directories are:");

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    System.out.println("[FILE] " + Arr[i].getName()
                                       + "     " + Arr[i].length()
                                       + " bytes");
                }
                else if(Arr[i].isDirectory())
                {
                    System.out.println("[DIR] " + Arr[i].getName());
                }
            }
        }
        else
        {
            System.out.println("Directory does not exist");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Path = null;

        System.out.println("Enter directory name:");
        Path = sobj.nextLine();

        Display(Path);
    }
}