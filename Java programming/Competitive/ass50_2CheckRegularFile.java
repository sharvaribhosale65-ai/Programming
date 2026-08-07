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
    public void CheckRegularFile(String FileName)
    {  
       File fObj = new File(FileName);

       if(fObj.exists())
       {
            if(fObj.isFile())
            {
                System.out.println("It is a regular file");
            }
            else
            {
                System.out.println("It is not a regular file");
            }
       }
       else
       {
            System.out.println("File does not exists.");
       }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept file from user and check it is a regular file or not.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass50_2CheckRegularFile
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter file name: ");
        String fName = sObj.nextLine();

        fObj.CheckRegularFile(fName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Demo.txt
// Output   :   It is a regular file

// Input    :   Nb.txt
// Output   :   It is not a regular file  
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
