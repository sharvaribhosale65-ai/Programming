//print 5 to 1 numbers

class NumberX
{
    public void display()
    {
        int iCnt = 5;

        while(iCnt >= 1)
        {
            System.out.print(iCnt+"\t");
            iCnt--;
        }
    }
}


class q2_PrintNumbers
{
    public static void main(String[] A)
    {
        NumberX nObj = new NumberX();

        nObj.display();
    }
}

/*
Input   :   5
Output  :   5       4       3       2       1
*/