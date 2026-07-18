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

class DoublyCircularLL 
{
    private node first;
    private node last;
    private int iCount;

    public DoublyCircularLL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = null;
        temp = first;

        if(first == null && last == null)
        {
            return;
        }
        do 
        {
            System.out.print(" | " + temp.data + " | -> ");
            temp = temp.next;
        }while(temp != last.next);
        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = null;

        newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            newn.prev = last;
            first = newn;
        }
        last.next = first;
        this.iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = null;

        newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;
            first.prev = newn;
            last = newn;
        }
        last.next = first;
        this.iCount++;
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
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
            last.next = first.next;
        }
        last.next = first;
        iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;

        temp = first;

        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = first.next;
        }
        else
        {
            while(temp.next != last)
            {
                temp = temp.next;
            }
            temp.next = first;
            first.prev = temp;
        }
        last.next = first;
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

public class program460_DoublyCircularLL 
{
    public static void main(String A[])
    {
        DoublyCircularLL sObj = new DoublyCircularLL();

        int iRet = 0;

        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        sObj.InsertFirst(51);
        sObj.InsertFirst(21);
        sObj.InsertFirst(11);
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);
       
        sObj.InsertLast(101);
        sObj.InsertLast(111);
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
 
        sObj.InsertAtPos(61, 3);
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);

        sObj.DeleteAtPos( 3);
        sObj.Display();
        iRet = sObj.Count();
        System.out.println("Number of nodes are : "+iRet);
        
    }
}
