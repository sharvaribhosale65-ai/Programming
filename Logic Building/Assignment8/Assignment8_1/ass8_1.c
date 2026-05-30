/*
Algorithm:

    START
        Accept radius as fRadius
        Calculate area using radius
        Display the result
    STOP
*/

/////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

/////////////////////////////////////////////////////////////////////////////
//
// Function name    :   CircleArea
// Input    :           float
// Output   :           float
// Description  :       Calculate area using radius
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////


double CircleArea(float fRadius)
{
    float fArea = 0.0;
    float fPi = 3.14;
    {
        fArea = fPi * fRadius * fRadius;
    }
    return fArea;
}

//////////////////////////////////////////////////////////////////////////////
//
// Application to calculate area using radius of float value
//
//////////////////////////////////////////////////////////////////////////////


int main()
{
    float fValue = 0.0f;
    float fRet = 0.0f;

    printf("Enter radius : ");
    scanf("%f",&fValue);

    fRet = CircleArea(fValue);

    printf("Area of the circle is %f",fRet);

    return 0;
}

//////////////////////////////////////////////////////////////////////////////
//
// Input    :   5.3
// Output   :   Area of the circle is 88.202614
//
//////////////////////////////////////////////////////////////////////////////