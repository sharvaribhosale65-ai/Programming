import java.io.*;
import java.util.*;

class Program2
{
    public static void SearchFile(String Path, String FileName)
    {
        File fobj = new File(Path);

        if(fobj.exists())
        {
            File Arr[] = fobj.listFiles();

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    if(Arr[i].getName().equals(FileName))
                    {
                        System.out.println("\nFile found\n");

                        System.out.println("Name : " + Arr[i].getName());
                        System.out.println("Size : " + Arr[i].length()
                                           + " bytes");
                        System.out.println("Path : " + Arr[i].getAbsolutePath());

                        return;
                    }
                }
            }

            System.out.println("\n" + FileName + " not found");
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
        String FileName = null;

        System.out.println("Enter directory:");
        Path = sobj.nextLine();

        System.out.println("\nEnter file to search:");
        FileName = sobj.nextLine();

        SearchFile(Path, FileName);
    }
}