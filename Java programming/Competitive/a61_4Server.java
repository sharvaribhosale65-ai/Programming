import java.net.*;
import java.io.*;

class Server
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(2100);

            System.out.println("Server is waiting for client...");

            Socket sobj = ssobj.accept();

            System.out.println("Client connected");

            DataInputStream diobj = new DataInputStream(sobj.getInputStream());
            DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

            String str = diobj.readUTF();

            String Arr[] = str.split(" ");

            String Command = Arr[0];
            String FileName = Arr[1];

            if(Command.equals("EXISTS"))
            {
                File fobj = new File(FileName);

                if(fobj.exists())
                {
                    doobj.writeUTF(FileName + " exists on server");
                }
                else
                {
                    doobj.writeUTF(FileName + " does not exist");
                }
            }

            diobj.close();
            doobj.close();
            sobj.close();
            ssobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
        }
    }
}