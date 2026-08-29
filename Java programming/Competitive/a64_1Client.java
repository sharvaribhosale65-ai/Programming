import java.net.*;
import java.io.*;

class Client
{
    public static void main(String args[])
    {
        try
        {
            Socket sobj = new Socket("localhost", 2100);

            BufferedReader brobj = new BufferedReader(
                                    new InputStreamReader(System.in));

            PrintWriter pwobj = new PrintWriter(
                                    sobj.getOutputStream(), true);

            BufferedReader brServer = new BufferedReader(
                                    new InputStreamReader(
                                    sobj.getInputStream()));

            System.out.println("Enter command :");
            String str = brobj.readLine();

            pwobj.println(str);

            String result = brServer.readLine();

            System.out.println("Server : " + result);

            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}