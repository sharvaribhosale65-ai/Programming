import java.net.*;
import java.io.*;
import java.util.*;

class Client
{
    public static void main(String Arg[])
    {
        try
        {
            Socket s = new Socket("localhost", 5100);

            BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                s.getInputStream()));

            PrintWriter pw = new PrintWriter(
                             s.getOutputStream(), true);

            Scanner sobj = new Scanner(System.in);

            String str = "";

            while(true)
            {
                System.out.print("Enter command : ");

                str = sobj.nextLine();

                pw.println(str);

                String result = br.readLine();

                System.out.println("Server : " + result);

                if(str.equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            s.close();
            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred : " + e);
        }
    }
}