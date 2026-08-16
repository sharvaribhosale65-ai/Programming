import java.util.*;

class ass57_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iN = 0;
        int i = 0;
        int iID = 0;
        int iValid = 0;
        int iDuplicate = 0;

        System.out.print("Enter number of votes: ");
        iN = sobj.nextInt();

        if(iN < 0)
        {
            System.out.println("Invalid number of votes");
            return;
        }

        HashSet<Integer> hobj = new HashSet<Integer>();

        System.out.println("Enter voter IDs:");

        for(i = 0; i < iN; i++)
        {
            iID = sobj.nextInt();

            if(iID < 0)
            {
                System.out.println("Invalid voter ID");
                continue;
            }

            if(hobj.contains(iID))
            {
                iDuplicate++;
            }
            else
            {
                hobj.add(iID);
                iValid++;
            }
        }

        System.out.println("Valid Votes: " + iValid);
        System.out.println("Rejected Duplicate Votes: " + iDuplicate);
    }
}