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
    protected int iNo;
    

    public Matrix(int iRow, int iCol, int iNo)
    {
        this.iRow = iRow;
        this.iCol = iCol;
        this.iNo = iNo;

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
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class name       :   MatrixLB
//  Description      :   Inherit Matrix class and calculate the frequency of a given number.
//  Author           :   Sharvari Gorakhnath Bhosale
//  Date             :   21.08.2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////


class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol, int iNo)
    {
        super(iRow, iCol, iNo);
    }

    public int FrequencyNumber()
    {
        int i = 0;
        int j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }
        return iCount;
    }

}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of the program to calculate the frequency of a given number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

public class ass62_2MatrixFrequencyNumber 
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int iRet = 0;
        int iNo = 0;

        System.out.println("Enter the number of rows : ");
        iRow = sObj.nextInt();

        System.out.println("Enter the number of columns : ");
        iCol = sObj.nextInt();

        System.out.println("Enter the number that you want to find frequency: ");
        iNo = sObj.nextInt();

        MatrixLB mObj = new MatrixLB(iRow, iCol, iNo);

        mObj.Accept();
        mObj.Display();

        iRet = mObj.FrequencyNumber();
        System.out.println("Frequency of " + iNo + " number is : "+ iRet);

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
//  Output  :   Frequency of 9 number is : 3
//
/////////////////////////////////////////////////////////////////////////////////////////////////
