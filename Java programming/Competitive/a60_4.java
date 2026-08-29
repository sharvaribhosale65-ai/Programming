import java.util.*;

import java.io.*;

class FileInformation
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter file name :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File Name     : " + fobj.getName());
            System.out.println("Absolute Path : " + fobj.getAbsolutePath());
            System.out.println("File Size     : " + fobj.length() + " bytes");
            System.out.println("Readable      : " + fobj.canRead());
            System.out.println("Writable      : " + fobj.canWrite());
            System.out.println("Hidden        : " + fobj.isHidden());
            System.out.println("Last Modified : " + new Date(fobj.lastModified()));
        }
        else
        {
            System.out.println("File does not exist");
        }

        sobj.close();
    }
}