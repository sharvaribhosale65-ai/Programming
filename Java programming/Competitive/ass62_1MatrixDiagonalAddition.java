/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Import required libraries
//
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class name       :   Matrix
//  Description      :   Create a matrix and provide functions to accept and display elements.
//  Author           :   Sharvari Gorakhnath Bhosale
//  Date             :   21.08.2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;

    public Matrix(int iRow, int iCol)
    {
        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0;
        int j = 0;

        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the elements of matrix : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sObj.nextInt();
            }
        }
        sObj.close();
    }

    public void Display()
    {
        int i = 0;
        int j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");;
            }
            System.out.println();
        }
    }

}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class name       :   MatrixLB
//  Description      :   Inherit Matrix class and perform diagonal addition.
//  Author           :   Sharvari Gorakhnath Bhosale
//  Date             :   21.08.2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////


class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public int DiagonalAddition()
    {
        int i = 0;
        int j = 0;
        int iSum = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }

}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class name       :   ass62_1MatrixDiagonalAddition
//  Description      :   Entry point of the program to calculate diagonal addition of a matrix.
//  Author           :   Sharvari Gorakhnath Bhosale
//  Date             :   21.08.2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

public class ass62_1MatrixDiagonalAddition 
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int iRet = 0;

        System.out.println("Enter the number of rows : ");
        iRow = sObj.nextInt();

        System.out.println("Enter the number of columns : ");
        iCol = sObj.nextInt();

        MatrixLB mObj = new MatrixLB(iRow, iCol);

        mObj.Accept();
        mObj.Display();

        iRet = mObj.DiagonalAddition();
        System.out.println("Addition of diagonal is : "+ iRet);

        mObj = null;
        System.gc();

        sObj.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   3       2       5       9
//              4       3       2       2
//              8       4       1       5
//              3       9       7       5
//
//  Output  :   Addition of diagonal is : 12
//
/////////////////////////////////////////////////////////////////////////////////////////////////
