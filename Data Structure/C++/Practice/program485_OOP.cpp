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
};

int main()
{

    ArrayX aObj(5);

    return 0;
}