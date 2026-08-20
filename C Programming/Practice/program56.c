//Input : 5
//Output : 1 2 3 4

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt < iNo; iCnt += 1)    //iCnt += 1 short hand operator
    {
        printf("%d\t",iCnt);         //t - tab
    }
    printf("\n");

}

int main()
{
    int iValue=0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}