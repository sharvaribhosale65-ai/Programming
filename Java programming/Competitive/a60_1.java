import java.net.*;
import java.io.*;

class ass60_1Client
{
    public static void main(String A[]) throws Exception
    {
        Socket s = new Socket("localhost", 5100);

        BufferedReader br = new BufferedReader(
                            new InputStreamReader(s.getInputStream()));

        PrintWriter pw = new PrintWriter(
                         s.getOutputStream(), true);

        BufferedReader input = new BufferedReader(
                               new InputStreamReader(System.in));

        String command;
        String result;

        while(true)
        {
            System.out.print("Enter command : ");
            command = input.readLine();

            pw.println(command);

            result = br.readLine();

            System.out.println("Server : " + result);

            if(command.equalsIgnoreCase("QUIT"))
            {
                break;
            }
        }

        s.close();
    }
}