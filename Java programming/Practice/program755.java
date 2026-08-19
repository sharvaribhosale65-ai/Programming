
import java.util.*;

class program755
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter string : ");
        String str = sObj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];

        // a    b   c   d
        // 97   98  99  100
        // 0    1   2   3

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++;
            }
        }

        System.out.println("Frequency of each letter is : ");

        int iMax = 0;
        char ch = '\0';

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] > 0)  //for present letters only
            {
                System.out.println((char)(i + 97)+" : "+Frequency[i]);

                if(Frequency[i] > iMax)
                {
                    iMax = Frequency[i];
                    ch = (char)(i + 97);
                }
            }
        }

        System.out.println("Maximum occured character is : "+ ch +" with frequency : "+iMax);

        sObj.close();
    }
}