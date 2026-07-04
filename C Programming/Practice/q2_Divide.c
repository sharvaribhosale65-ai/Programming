//Accept 2 numbers from user and perform division

#include<stdio.h>

int Divide(int iNo1, int iNo2)
{
    int iAns = 0;

    iAns = iNo1 / iNo2;

    return iAns;
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    int iRet = 0;

    printf("Enter first number : ");
    scanf("%d",&iValue1);

    printf("Enter second number : ");
    scanf("%d",&iValue2);

    iRet = Divide(iValue1, iValue2);

    printf("Division is : %d",iRet);

    return 0;
}

/*
Input   :   45  5
Output  :   9
*/