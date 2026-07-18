#include<iostream>
using namespace std;

class ArrayX
{
    public :
        int *Arr;
        int Size;

        ArrayX(int No)                  //No = 5
        {
            Size = No;                  //Size = 5
            Arr = new int[Size];        //Arr allocate memory for 5 elements 
        }

        ~ArrayX()
        {
            delete []Arr;               //[]Arr - whole array gets deleted
        }

        void Accept()
        {
            int i = 0;
            cout << "Enter the elements : "<<"\n";
            for(i = 0; i < Size; i++)
            {
                cin >> Arr[i];
            }
        }

        void Display()
        {
            int i = 0;
            cout << "Elements of the array are : "<<"\n";
            for(i = 0; i < Size; i++)
            {
                cout << Arr[i] << "\n";
            }
        }
};

int main()
{

    ArrayX aObj(5);

    aObj.Accept();
    aObj.Display();

    return 0;
}