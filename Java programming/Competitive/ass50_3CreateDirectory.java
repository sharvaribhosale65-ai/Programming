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
    public void CreateDirectory(String DirName)
    {  
       File fObj = new File(DirName);

       if(fObj.exists())
       {
            System.out.println("Directory already created...");
       }
       else
       {
            if(fObj.mkdir())
            {
                System.out.println("Directory created successfully...");
            }
            else
            {
                System.out.println("Unable to create directory..");
            }
       }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept file from user and check it is a regular file or not.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass50_3CreateDirectory
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter the directory name: ");
        String dName = sObj.nextLine();

        fObj.CreateDirectory(dName);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Marvellous
// Output   :   Directory already created...

// Input    :   Infosystem
// Output   :   Directory created successfully...  
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
