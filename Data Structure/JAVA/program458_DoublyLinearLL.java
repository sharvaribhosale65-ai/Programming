class node
{
    public int data;
    public node next;
    public node prev;

    node(int iNo)
    {
        this.data = iNo;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    private node first;
    private int iCount;

    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        System.out.print("NULL <=> ");
        while(temp != null)
        {
            System.out.print(" | " + temp.data + " | <=> ");
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
            first.prev = newn;
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
            temp.next.prev = temp.next;
            newn.next = null;
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
            temp.next.prev = newn;
            temp.next = newn;
            newn.prev = temp;

            this.iCount++;
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
            first.next.prev = null;
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
            temp.next.prev = temp;
            iCount--;
        }
    }
}

public class program458_DoublyLinearLL 
{
    public static void main(String A[])
    {
        DoublyLL dObj = new DoublyLL();
        int iRet = 0;

        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        dObj.InsertFirst(51);
        dObj.InsertFirst(21);
        dObj.InsertFirst(11);
        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        dObj.InsertLast(101);
        dObj.InsertLast(111);
        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        dObj.DeleteFirst();
        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        dObj.DeleteLast();
        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        dObj.InsertAtPos(61,3);
        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        dObj.DeleteAtPos(3);
        dObj.Display();
        iRet = dObj.Count();
        System.out.println("Number of nodes are : "+iRet);
    }    
}
