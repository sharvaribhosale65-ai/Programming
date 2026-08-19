//matrics questions
//summation

import java.util.*;

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;


    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
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

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public int SummationAll()
    {
        int iSum = 0, i = 0, j = 0;
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    public void SummationRow()
    {
        int iSum = 0, i = 0, j = 0;
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println("Summation of row is : " + i + " is : "+iSum);
            iSum = 0;
        }
    }

    public int MaximumAll()
    {
        int iMax = 0, i = 0, j = 0;

        iMax = Arr[0][0];       //first row first element

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;  
    }

    public int MinimumAll()
    {
        int iMin = 0, i = 0, j = 0;

        iMin = Arr[0][0];       //first row first element

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;  
    }

}

class program800
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;
        int i = 0;
        int j = 0;
        int iRet = 0;


        System.out.println("Enter number of rows : ");
        iRow = sObj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sObj.nextInt();

        MatrixLB mObj = new MatrixLB(iRow, iCol);

        mObj.Accept();
        mObj.Display();

        iRet = mObj.SummationAll();
        System.out.println("Summation of all elements : "+iRet);

        mObj.SummationRow();
        
        iRet = mObj.MaximumAll();
        System.out.println("Maximum number is : "+iRet);

        iRet = mObj.MinimumAll();
        System.out.println("Minimum number is : "+iRet);

        mObj = null;
        System.gc();

        sObj.close();
    }
}