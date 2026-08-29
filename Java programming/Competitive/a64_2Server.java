import java.net.*;
import java.io.*;
import java.util.*;

class Server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(2100);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket sobj = ssobj.accept();

            BufferedReader brobj = new BufferedReader(
                                    new InputStreamReader(
                                    sobj.getInputStream()));

            PrintWriter pwobj = new PrintWriter(
                                    sobj.getOutputStream(), true);

            while(true)
            {
                String command = brobj.readLine();

                if(command.equals("DATE"))
                {
                    Date dobj = new Date();
                    pwobj.println(dobj);
                }
                else if(command.equals("TIME"))
                {
                    Date dobj = new Date();
                    pwobj.println(dobj);
                }
                else if(command.equals("SERVERNAME"))
                {
                    String name = InetAddress.getLocalHost().getHostName();

                    pwobj.println("Server Name : " + name);
                }
                else if(command.equals("HELP"))
                {
                    pwobj.println("Available Commands :");
                    pwobj.println("DATE");
                    pwobj.println("TIME");
                    pwobj.println("SERVERNAME");
                    pwobj.println("HELP");
                    pwobj.println("QUIT");
                }
                else if(command.equals("QUIT"))
                {
                    pwobj.println("Server connection closed");
                    break;
                }
                else
                {
                    pwobj.println("Invalid command");
                }
            }

            sobj.close();
            ssobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}