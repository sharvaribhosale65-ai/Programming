////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : Display
// Input         : void
// Output        : string
// Description   : Accept file name from user and create new file of that name if it is not exists.
// Date          : 07/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void CreateFile(String fname)
    {  
        try
        {
            File fObj = new File(fname);

            if(fObj.exists())
            {
                System.out.println("File already exists...");
            }
            else
            {
                if(fObj.createNewFile())
                {
                    System.out.println("File created successfully....");
                }
                else
                {
                    System.out.println("Unable to create file");
                }
            }
        }
        catch(IOException  e)
        {
            System.out.println("Unable to open file.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to accept file name from user and create new file of that name if it is not exists
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass49_4
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter the filename : ");
        String Filename = sObj.nextLine();

        fObj.CreateFile(Filename);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Demo.txt   
// Output   :   File already exists...
//
// Input    :   Hello.txt   
// Output   :   File created successfully....
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
