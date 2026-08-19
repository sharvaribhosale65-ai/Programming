//matrics questions

import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int iRow, int iCol)       //parameterized constructor
    {
        System.out.println("Inside matrix constructor");
        Arr = new int[iRow][iCol];
    }

    protected void finalize()
    {
        System.out.println("inside finalize method");
        Arr = null;
        System.gc();
    }
}

class program790
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int i = 0;
        int j = 0;

        System.out.println("Enter number of rows : ");
        iRow = sObj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sObj.nextInt();

        Matrix mObj = new Matrix(iRow, iCol);

        /* 
        System.out.println("Enter the elements of matrix : ");
        
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sObj.nextInt();
            }
        }

        System.out.println("Elements of matrix  are : ");
        
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
            */

        sObj.close();
    }
}