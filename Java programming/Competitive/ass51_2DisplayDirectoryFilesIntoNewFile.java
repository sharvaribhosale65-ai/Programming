////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : DisplayDirectoryFilesIntoNewFile
// Input         : void
// Output        : string
// Description   : Accept directory name and file name from user and 
//                 write names of file from directory into the file.
// Date          : 08/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void DisplayDirectoryFilesIntoNewFile(String DirName, String FileName)
    {  
        File fObj = new File(DirName);

        if(fObj.exists() && fObj.isDirectory())
        {
            File Arr[] = fObj.listFiles();
            int i = 0;

            try
            {
                FileOutputStream fout = new FileOutputStream(FileName);

                for(i = 0; i < Arr.length; i++)
                {
                    if(Arr[i].isFile())
                    {
                        {
                            String str = Arr[i].getName() + "\n";
                            fout.write(str.getBytes());
                        }
                    }
                }
                fout.close();

                System.out.println("File names copied successfully...");
            }
            catch(Exception e)
            {
                System.out.println("Unable to copy file names into file");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept directory name and file name from user and write file names
// from directory into the file.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass51_2DisplayDirectoryFilesIntoNewFile
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter directory name: ");
        String dName = sObj.nextLine();

        System.out.println("Enter the Filename : ");
        String fName = sObj.nextLine();

        fObj.DisplayDirectoryFilesIntoNewFile(dName, fName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Marvellous      fool.txt
// Output   :   File names copied successfully...
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
