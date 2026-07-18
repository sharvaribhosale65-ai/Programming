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
    public node first;      //declaration
    public int iCount;

    public SinglyLL()
    {
        System.out.println("Inside constructor");
        this.first = null;      //definition
        this.iCount = 0;
    }

}

class program451
{
    public static void main(String A[])
    {
       SinglyLL sObj = new SinglyLL();      //create object of class
    }
}