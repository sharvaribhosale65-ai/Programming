//matrics questions

import java.util.*;

class Matrix
{
    public int Arr[][];
    private int iRow;       //private means accessible inside matrix only
    private int iCol;


    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    protected void finalize()
    {
        System.out.println("inside finalize method");
        Arr = null;
        System.gc();
    }

    public void Accept()
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the elements of matrix : ");
        
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sObj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of matrix  are : ");
        
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class program793
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

        mObj.Accept();
        mObj.Display();

        mObj = null;
        System.gc();

        sObj.close();
    }
}