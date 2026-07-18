#include<iostream>
using namespace std;

class ArrayX
{
    public :
        int *Arr;
        int Size;

        ArrayX(int No);    
        ~ArrayX();

        void Accept();

        void Display();

        int Summation();
};

ArrayX :: ArrayX(int No)                  //No = 5
{
    Size = No;                          //Size = 5
    Arr = new int[Size];                //Arr allocate memory for 5 elements 
}

ArrayX :: ~ArrayX()
{
    delete []Arr;                       //[]Arr - whole array gets deleted
}

void ArrayX :: Accept()
{
    int i = 0;
    cout << "Enter the elements : "<<"\n";
    for(i = 0; i < Size; i++)
    {
        cin >> Arr[i];
    }
}

void ArrayX :: Display()
{
    int i = 0;
    cout << "Elements of the array are : "<<"\n";
    for(i = 0; i < Size; i++)
    {
        cout << Arr[i] << "\n";
    }
}

int ArrayX :: Summation()
{
    int i = 0;
    int Sum = 0;
    
    for(i = 0; i < Size; i++)
    {
        Sum = Sum +Arr[i];
    }
    return Sum;
}

int main()
{

    ArrayX aObj(5);

    aObj.Accept();
    aObj.Display();

    cout << "Summation of the array are : " << aObj.Summation() <<"\n";

    return 0;
}