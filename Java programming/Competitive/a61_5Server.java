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

            if(Command.equals("INFO"))
            {
                File fobj = new File(FileName);

                if(fobj.exists())
                {
                    doobj.writeUTF(
                        "\nFile Name     : " + fobj.getName() +
                        "\nSize          : " + fobj.length() + " bytes" +
                        "\nReadable      : " + fobj.canRead() +
                        "\nWritable      : " + fobj.canWrite() +
                        "\nAbsolute Path : " + fobj.getAbsolutePath()
                    );
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