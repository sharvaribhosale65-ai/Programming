import java.net.*;
import java.io.*;
import java.util.*;

class Client
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            Socket ssobj = new Socket("localhost", 2100);

            DataInputStream diobj = new DataInputStream(ssobj.getInputStream());
            DataOutputStream doobj = new DataOutputStream(ssobj.getOutputStream());

            String FileName = null;

            System.out.println("Client:");

            System.out.print("EXISTS ");
            FileName = sobj.nextLine();

            doobj.writeUTF("EXISTS " + FileName);

            String str = diobj.readUTF();

            System.out.println("\nServer:");
            System.out.println(str);

            diobj.close();
            doobj.close();
            ssobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
        }
    }
}