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

            if(Arr.length != 2)
            {
                return "Invalid command";
            }

            String command = Arr[0].toUpperCase();

            int No = Integer.parseInt(Arr[1]);

            if(command.equals("EVEN"))
            {
                return CheckEven(No);
            }
            else if(command.equals("ODD"))
            {
                return CheckOdd(No);
            }
            else if(command.equals("PRIME"))
            {
                return CheckPrime(No);
            }
            else if(command.equals("PERFECT"))
            {
                return CheckPerfect(No);
            }
            else if(command.equals("FACTORIAL"))
            {
                return Factorial(No);
            }
            else if(command.equals("REVERSE"))
            {
                return Reverse(No);
            }
            else
            {
                return "Invalid command";
            }
        }
        catch(NumberFormatException e)
        {
            return "Invalid number";
        }
        catch(Exception e)
        {
            return "Invalid command";
        }
    }

    String CheckEven(int No)
    {
        if(No % 2 == 0)
        {
            return No + " is an Even Number";
        }
        else
        {
            return No + " is not an Even Number";
        }
    }

    String CheckOdd(int No)
    {
        if(No % 2 != 0)
        {
            return No + " is an Odd Number";
        }
        else
        {
            return No + " is not an Odd Number";
        }
    }

    String CheckPrime(int No)
    {
        int i = 0;

        if(No <= 1)
        {
            return No + " is not a Prime Number";
        }

        for(i = 2; i <= No / 2; i++)
        {
            if(No % i == 0)
            {
                return No + " is not a Prime Number";
            }
        }

        return No + " is a Prime Number";
    }

    String CheckPerfect(int No)
    {
        int i = 0;
        int Sum = 0;

        for(i = 1; i <= No / 2; i++)
        {
            if(No % i == 0)
            {
                Sum = Sum + i;
            }
        }

        if(Sum == No)
        {
            return No + " is a Perfect Number";
        }
        else
        {
            return No + " is not a Perfect Number";
        }
    }

    String Factorial(int No)
    {
        int i = 0;
        long Fact = 1;

        if(No < 0)
        {
            return "Factorial is not possible";
        }

        for(i = 1; i <= No; i++)
        {
            Fact = Fact * i;
        }

        return "Factorial is : " + Fact;
    }

    String Reverse(int No)
    {
        int Digit = 0;
        int Rev = 0;
        int Temp = No;

        while(Temp != 0)
        {
            Digit = Temp % 10;

            Rev = (Rev * 10) + Digit;

            Temp = Temp / 10;
        }

        return "Reverse is : " + Rev;
    }
}