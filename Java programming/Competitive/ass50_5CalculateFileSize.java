////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : CheckRegularFile
// Input         : void
// Output        : string
// Description   : Accept file from user and check it is a regular file or not.
// Date          : 08/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void CalculateFileSize(String DirName)
    {  
        File fObj = new File(DirName);
        
        int i = 0;
        
        if(fObj.exists() && fObj.isDirectory())
        {
            File Arr[] = fObj.listFiles();

            System.out.println("Files in directory are : \n");

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    System.out.println(Arr[i].getName());
                    System.out.println("Size of file : " + Arr[i].length() + "bytes");
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("Directory does not exist.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept file from user and check it is a regular file or not.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass50_5CalculateFileSize
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter the directory name: ");
        String dName = sObj.nextLine();

        fObj.CalculateFileSize(dName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Marvellous
// Output   :   Files in directory are :
//
//              ass13_1.c
//              Size of file : 3178bytes
//
//              ass13_2.c
//              Size of file : 2905bytes
//
//              ass13_3.c
//              Size of file : 2954bytes
//
//              ass13_4.c
//              Size of file : 2945bytes
//
//              ass13_5.c
//              Size of file : 2923bytes 
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
