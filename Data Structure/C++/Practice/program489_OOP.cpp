#include<iostream>
using namespace std;

template <class T>

class ArrayX
{
    public :
        T *Arr;
        int Size;

        ArrayX(int No)                  //No = 5
        {
            Size = No;                  //Size = 5
            Arr = new T[Size];        //Arr allocate memory for 5 elements 
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

        T Summation()
        {
            int i = 0;
            T Sum = 0;
            
            for(i = 0; i < Size; i++)
            {
                Sum = Sum +Arr[i];
            }
            return Sum;
        }
};

int main()
{

    ArrayX <float>aObj(5);

    aObj.Accept();
    aObj.Display();

    cout << "Summation of the array are : " << aObj.Summation() <<"\n";

    return 0;
}