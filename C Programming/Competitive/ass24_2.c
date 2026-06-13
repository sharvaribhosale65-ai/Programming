#include<stdio.h>

void Pattern(
                int iNo1,                                   //first input       
                int iNo2                                    //second input
            )
{
    int i = 0;
    int j = 0;
    char ch1 = '\0';
    char ch2 = '\0';

    for(i = 1; i <= iNo1; i++)
    {
        for(j = 1, ch1 = 'A', ch2 = 'a'; j <= iNo2; j++)
        {
           if(i % 2 == 0)
           {
            printf("%c\t",ch2);
            ch2++;
           }
           else
           {
            printf("%c\t",ch1);
            ch1++;
           }
        }
        printf("\n");
    }
}

int main()

{
    int iValue1 = 0;                                       //to store first input
    int iValue2 = 0;                                       //to store second input 

    printf("Enter number of rows : ");
    scanf("%d",&iValue1);
 
    printf("Enter number of columns : ");
    scanf("%d",&iValue2);

    Pattern(iValue1, iValue2);                            //display result 

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   4,  4
//Output    :   A       B       C       D
//              a       b       c       d
//              A       B       C       D
//              a       b       c       d
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
