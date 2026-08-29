import java.io.*;
import java.util.*;

class Program3
{
    public static void FileAnalysis(String FileName)
    {
        try
        {
            File fobj = new File(FileName);

            if(fobj.exists() == false)
            {
                System.out.println("File does not exist");
                return;
            }

            FileReader frobj = new FileReader(fobj);

            int iRet = 0;

            int iChar = 0;
            int iWord = 0;
            int iLine = 0;
            int iUpper = 0;
            int iLower = 0;
            int iDigit = 0;
            int iSpace = 0;

            boolean bWord = false;

            while((iRet = frobj.read()) != -1)
            {
                char ch = (char)iRet;

                iChar++;

                if(ch == '\n')
                {
                    iLine++;
                }

                if(ch == ' ')
                {
                    iSpace++;
                    bWord = false;
                }
                else if(ch == '\n' || ch == '\t')
                {
                    bWord = false;
                }
                else
                {
                    if(bWord == false)
                    {
                        iWord++;
                        bWord = true;
                    }
                }

                if(ch >= 'A' && ch <= 'Z')
                {
                    iUpper++;
                }

                if(ch >= 'a' && ch <= 'z')
                {
                    iLower++;
                }

                if(ch >= '0' && ch <= '9')
                {
                    iDigit++;
                }
            }

            if(iChar > 0)
            {
                iLine++;
            }

            frobj.close();

            System.out.println("\nFile Analysis:");

            System.out.println("Total characters : " + iChar);
            System.out.println("Total words      : " + iWord);
            System.out.println("Total lines      : " + iLine);
            System.out.println("Uppercase        : " + iUpper);
            System.out.println("Lowercase        : " + iLower);
            System.out.println("Digits           : " + iDigit);
            System.out.println("Spaces           : " + iSpace);
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter file name:");
        FileName = sobj.nextLine();

        FileAnalysis(FileName);
    }
}