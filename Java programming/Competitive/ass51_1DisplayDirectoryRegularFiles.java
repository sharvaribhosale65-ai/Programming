////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : DisplayDirectoryRegularFiles
// Input         : void
// Output        : string
// Description   : Accept directory name from user and display only regular files from that directory.
// Date          : 08/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void DisplayDirectoryRegularFiles(String DirName)
    {  
       File fObj = new File(DirName);

       if(fObj.exists() && fObj.isDirectory())
       {
            int i = 0;

            File Arr[] = fObj.listFiles();

            System.out.println("Regular files are : ");

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    System.out.println(Arr[i].getName() + " : It is a regular file");
                }
                else
                {
                    System.out.println(Arr[i].getName() + " : It is not a regular file");
                }
            }
       }
    
       else
       {
            System.out.println("Directory does not exists.");
       }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept directory name from user and display only regular files of that directory.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass51_1DisplayDirectoryRegularFiles
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter directory name: ");
        String dName = sObj.nextLine();

        fObj.DisplayDirectoryRegularFiles(dName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Demo.txt
// Output   :   Regular files are :
//              ass13_1.c : It is a regular file
//              ass13_2.c : It is a regular file
//              ass13_3.c : It is a regular file
//              ass13_4.c : It is a regular file
//              ass13_5.c : It is a regular file
//              focus.jpg : It is a regular file
//              Music : It is not a regular file
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
