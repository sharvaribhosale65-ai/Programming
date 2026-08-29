import java.net.*;
import java.io.*;

class Server
{
    public static void main(String Arg[])
    {
        try
        {
            ServerSocket ss = new ServerSocket(5100);

            System.out.println("Server is running...");

            while(true)
            {
                Socket s = ss.accept();

                System.out.println("Client connected.");

                ClientHandler obj = new ClientHandler(s);

                Thread t = new Thread(obj);

                t.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred : " + e);
        }
    }
}

class ClientHandler implements Runnable
{
    Socket s;

    ClientHandler(Socket s)
    {
        this.s = s;
    }

    public void run()
    {
        try
        {
            BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                s.getInputStream()));

            PrintWriter pw = new PrintWriter(
                             s.getOutputStream(), true);

            String str = "";

            while(true)
            {
                str = br.readLine();

                if(str == null)
                {
                    break;
                }

                if(str.equalsIgnoreCase("QUIT"))
                {
                    pw.println("Client disconnected.");
                    break;
                }

                String result = Calculate(str);

                pw.println(result);
            }

            s.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred : " + e);
        }
    }

    String Calculate(String str)
    {
        try
        {
            String Arr[] = str.split(" ");

            if(Arr.length != 3)
            {
                return "Invalid command";
            }

            String command = Arr[0].toUpperCase();

            int No1 = Integer.parseInt(Arr[1]);
            int No2 = Integer.parseInt(Arr[2]);

            int Ans = 0;

            if(command.equals("ADD"))
            {
                Ans = No1 + No2;
            }
            else if(command.equals("SUB"))
            {
                Ans = No1 - No2;
            }
            else if(command.equals("MULT"))
            {
                Ans = No1 * No2;
            }
            else if(command.equals("DIV"))
            {
                if(No2 == 0)
                {
                    return "Division by zero is not allowed";
                }

                Ans = No1 / No2;
            }
            else if(command.equals("MOD"))
            {
                if(No2 == 0)
                {
                    return "Division by zero is not allowed";
                }

                Ans = No1 % No2;
            }
            else if(command.equals("MAX"))
            {
                Ans = Math.max(No1, No2);
            }
            else if(command.equals("MIN"))
            {
                Ans = Math.min(No1, No2);
            }
            else
            {
                return "Invalid command";
            }

            return "Result is : " + Ans;
        }
        catch(NumberFormatException e)
        {
            return "Invalid numbers";
        }
        catch(Exception e)
        {
            return "Invalid command";
        }
    }
}