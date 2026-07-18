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

    }

    public void DeleteFirst()
    {
        
    }

    public void DeleteLast()
    {
        
    }

    public void DeleteAtPos(int iPos)
    {

    }

}

class program454
{
    public static void main(String A[])
    {
       SinglyLL sObj = new SinglyLL();      //create object of class

       sObj.InsertFirst(51);
       sObj.InsertFirst(21);
       sObj.InsertFirst(11);
       sObj.Display();
       

       sObj.InsertLast(101);
       sObj.InsertLast(111);
       sObj.InsertLast(121);
       sObj.Display();
    }
}