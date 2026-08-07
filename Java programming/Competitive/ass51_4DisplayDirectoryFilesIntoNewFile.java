////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : DisplayDirectoryFilesIntoNewFile
// Input         : void
// Output        : string
// Description   : Accept directory name and file name from user and 
//                 write all data with its file name from directory into the another file.
// Date          : 07/08/2026
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

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                for(i = 0; i < Arr.length; i++)
                {
                    if(Arr[i].isFile())
                    {
                        // Write File Name
                        String Header = "******** " + Arr[i].getName() + " ********\n";
                        fout.write(Header.getBytes());

                        // Open Current File
                        FileInputStream fin = new FileInputStream(Arr[i]);

                        // Copy File Data
                        while((iRet = fin.read(Buffer)) != -1)
                        {
                            fout.write(Buffer, 0, iRet);
                        }

                        // Leave one blank line after each file
                        fout.write("\n\n".getBytes());

                        fin.close();
                    }
                }

                fout.close();

                System.out.println("Files copied with their data successfully...");
            }
            catch(Exception e)
            {
                System.out.println("Unable to copy files into another file");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept directory name and file name from user and 
// write all data with its file name from directory into the another file.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass51_4DisplayDirectoryFilesIntoNewFile
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
// Input    :   Marvellous      Win.txt
// Output   :   Data copied successfully...
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
