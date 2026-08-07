////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : CopyFileData
// Input         : void
// Output        : string
// Description   : Accept two files from user and copied one file data into the another.
// Date          : 08/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void CopyFileData(String FileName1, String FileName2)
    {  
        byte Buffer[] = new byte[1024];
        int iRet = 0;

        try
        {
            FileInputStream fObj1 = new FileInputStream(FileName1);
            FileOutputStream fObj2 = new FileOutputStream(FileName2);

            while((iRet = fObj1.read(Buffer)) != -1)
            {
                fObj2.write(Buffer, 0, iRet);
            }
            fObj1.close();
            fObj2.close();

            System.out.println("File copied successfully...");
        }
        catch(Exception eObj)
        {
            System.out.println("Unable to copied file...");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept two files from user and copied one file data into the another.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass50_1
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter the source file : ");
        String fName1 = sObj.nextLine();

        System.out.println("Enter the destination file : ");
        String fName2 = sObj.nextLine();

        fObj.CopyFileData(fName1, fName2);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Demo.txt    Sun.txt
// Output   :   File copied successfully...
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
