//matrics questions

import java.util.*;

class program786
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        //jagged array
        int Arr[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90, 100}, {11, 21}};

        for(int i = 0; i < Arr.length; i++)     //Arr.length - no. of rows(4)
        {
            for(int j = 0; j < Arr[i].length; j++)      //Arr[i].length - no. of element in current row (3, 3, 4, 2)
            {
                System.out.println(Arr[i][j] + "\t");
               
            }
             System.out.println();
        }

        sObj.close();
    }
}