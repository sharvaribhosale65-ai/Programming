import java.net.*;
import java.io.*;

class Server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(2100);
            System.out.println("Server is waiting for client...");

            Socket sobj = ssobj.accept();
            System.out.println("Client connected");

            BufferedReader brobj = new BufferedReader(
                                    new InputStreamReader(sobj.getInputStream()));

            PrintWriter pwobj = new PrintWriter(sobj.getOutputStream(), true);

            String str = brobj.readLine();

            String arr[] = str.split(" ", 2);

            String command = arr[0];
            String data = arr[1];

            String result = "";

            if(command.equals("LENGTH"))
            {
                result = "Length : " + data.length();
            }
            else if(command.equals("UPPER"))
            {
                result = data.toUpperCase();
            }
            else if(command.equals("LOWER"))
            {
                result = data.toLowerCase();
            }
            else if(command.equals("REVERSE"))
            {
                StringBuffer sbobj = new StringBuffer(data);
                result = sbobj.reverse().toString();
            }
            else if(command.equals("PALINDROME"))
            {
                StringBuffer sbobj = new StringBuffer(data);
                String rev = sbobj.reverse().toString();

                if(data.equalsIgnoreCase(rev))
                {
                    result = "String is Palindrome";
                }
                else
                {
                    result = "String is not Palindrome";
                }
            }
            else if(command.equals("VOWELS"))
            {
                int iCnt = 0;

                for(int i = 0; i < data.length(); i++)
                {
                    char ch = data.charAt(i);

                    if(ch == 'a' || ch == 'e' || ch == 'i' ||
                       ch == 'o' || ch == 'u' ||
                       ch == 'A' || ch == 'E' || ch == 'I' ||
                       ch == 'O' || ch == 'U')
                    {
                        iCnt++;
                    }
                }

                result = "Number of vowels : " + iCnt;
            }
            else
            {
                result = "Invalid command";
            }

            pwobj.println(result);

            sobj.close();
            ssobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}