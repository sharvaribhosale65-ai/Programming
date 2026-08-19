//matrics questions

import java.util.*;

class program788
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter number of rows : ");
        iRow = sObj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sObj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);

        sObj.close();
    }
}