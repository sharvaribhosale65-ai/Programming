
class node
{
    public int data;
    public node next;

    node(int iNo)
    {
        this.data = iNo;
        this.next = null;
    }
}

class SinglyLL
{
    private node first;      //declaration
    private int iCount;

    public SinglyLL()
    {
        System.out.println("Inside constructor");
        this.first = null;      //definition
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.print(" | " + temp.data + " | -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = null;

        newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = null;
        node temp = null;

        newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            temp = first;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public void InsertAtPos(int iNo, int iPos)
    {
        node newn = null;

        int i = 0;

        if(iPos < 1 || iPos > iCount+1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(iNo);
        }
        else
        {
            newn = new node(iNo);

            node temp = null;
            temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;

            iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = first.next;
        }
        else
        {
            first = first.next;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;

        temp = first;

        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = first.next;
        }
        else
        {
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        int i = 0;

        if(iPos < 1 || iPos > iCount+1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else
        {
            node temp = null;

            temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            iCount--;
        }
    }

}

class program457_SinglyLinearLL
{
    public static void main(String A[])
    {
        SinglyLL sObj = new SinglyLL();      //create object of class

        int iRet = 0;

        sObj.InsertFirst(51);
        sObj.InsertFirst(21);
        sObj.InsertFirst(11);
        
        sObj.InsertLast(101);
        sObj.InsertLast(111);
        sObj.InsertLast(121);
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        sObj.DeleteFirst();
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        sObj.DeleteLast();
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        sObj.InsertAtPos(105,4);
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        sObj.DeleteAtPos(4);
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);
    }
}





















