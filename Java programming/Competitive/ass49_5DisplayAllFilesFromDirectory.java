////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : CheckDirectory
// Input         : void
// Output        : string
// Description   : Accept directory name from user and if it is exists display all files from that directory
// Date          : 08/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void CheckDirectory(String dirName)
    {  
        File fObj = new File(dirName);

        int i = 0;
        
        if(fObj.exists() && fObj.isDirectory())
        {
            File Arr[] = fObj.listFiles();

            System.out.println("Files in directory are : ");

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    System.out.println(Arr[i].getName());
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
// Application to accept directory name from user and if it is exists display all files from that directory
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass49_5
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter the directory name : ");
        String DName = sObj.nextLine();

        fObj.CheckDirectory(DName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Marvellous 
// Output   :   Files in directory are :
//              ass13_1.c
//              ass13_2.c
//              ass13_3.c
//              ass13_4.c
//              ass13_5.c
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
