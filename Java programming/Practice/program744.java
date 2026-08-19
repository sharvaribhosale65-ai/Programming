//String - immutable 
//bufferString - mutable(contains reverse method)


import java.util.*;

class program744
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        StringBuffer sb = new StringBuffer(str); //convert string into string buffer

        System.out.println(sb.reverse());

        sObj.close();
    }
}