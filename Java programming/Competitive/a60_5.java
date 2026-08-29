import java.util.*;

import java.io.*;

class DirectoryDisplay
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String Path = null;

        System.out.println("Enter directory :");
        Path = sobj.nextLine();

        File fobj = new File(Path);

        if(fobj.exists())
        {
            if(fobj.isDirectory())
            {
                String Names[] = fobj.list();

                System.out.println("Contents :");

                for(int i = 0; i < Names.length; i++)
                {
                    System.out.println(Names[i]);
                }
            }
            else
            {
                System.out.println("Path is not a directory");
            }
        }
        else
        {
            System.out.println("Directory does not exist");
        }

        sobj.close();
    }
}