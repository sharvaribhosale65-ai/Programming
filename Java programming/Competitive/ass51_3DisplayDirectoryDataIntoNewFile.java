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
//                 copied all data from directory into the file.
// Date          : 08/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void DisplayDirectoryDataIntoNewFile(String DirName, String FileName)
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
                        FileInputStream fin = new FileInputStream(Arr[i]);

                        while((iRet = fin.read(Buffer)) != -1)
                        {
                            fout.write(Buffer,0,iRet);
                        }

                        fin.close();
                    }
                }
                fout.close();

                System.out.println("Data copied successfully...");
            }
            catch(Exception e)
            {
                System.out.println("Unable to copy data into file");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept directory name and file name from user and copied all data
// from directory into the file.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass51_3DisplayDirectoryDataIntoNewFile
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter directory name: ");
        String dName = sObj.nextLine();

        System.out.println("Enter the Filename : ");
        String fName = sObj.nextLine();

        fObj.DisplayDirectoryDataIntoNewFile(dName, fName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Marvellous      Win.txt
// Output   :   Data copied successfully...
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
