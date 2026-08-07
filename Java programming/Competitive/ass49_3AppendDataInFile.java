////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : Display
// Input         : void
// Output        : string
// Description   : Append data at the end of the file
// Date          : 07/08/2026
// Author        : Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void AddData(String fname, String fData)
    {
        
        try
        {
            FileOutputStream fObj = new FileOutputStream(fname, true);

            byte Buffer[] = fData.getBytes();

            fObj.write(Buffer);

            fObj.close();

            System.out.println("Data written successfully..");
        }
        catch(IOException  e)
        {
            System.out.println("Unable to open file.");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to append data at the end of the file
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class ass49_3
{
    public static void main(String[] args) 
    {
        Scanner sObj = new Scanner(System.in);
        FileX fObj = new FileX();

        System.out.println("Enter the filename : ");
        String Filename = sObj.nextLine();

        System.out.println("Enter the data : ");
        String Data = sObj.nextLine();

        fObj.AddData(Filename, Data);

        sObj.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input    :   Demo.txt    Marvellous
// Output   :   Data written successfully..
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////
