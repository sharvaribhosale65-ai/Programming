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
 
    }

    public void InsertLast(int iNo)
    {
        
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

class program452
{
    public static void main(String A[])
    {
       SinglyLL sObj = new SinglyLL();      //create object of class

       
    }
}