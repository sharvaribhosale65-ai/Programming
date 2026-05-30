/*
Algorithm:

    START
        Accept width as fWidth
        Accept height as fHeight
        Calculate area using width and height
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
// Function name    :   RectArea
// Input    :           float, float
// Output   :           float
// Description  :       Calculate area using width and height
// Date :               30/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

double RectArea(float fWidth, float fHeight)
{
    float fArea = 0.0f;
    {
        fArea = fWidth * fHeight;
    }
    return fArea;
}

//////////////////////////////////////////////////////////////////////////////
//
// Application to calculate area using width and height of 2 float values
//
//////////////////////////////////////////////////////////////////////////////

int main()
{
    float fValue1 = 0.0f;
    float fValue2 = 0.0f;
    float fRet = 0.0f;

    printf("Enter width : ");
    scanf("%f",&fValue1);

    printf("Enter height : ");
    scanf("%f",&fValue2);

    fRet = RectArea(fValue1, fValue2);

    printf("Area of rectangle is %f", fRet);

    return 0;
}

//////////////////////////////////////////////////////////////////////////////
//
// Input    :   5.3     9.87
// Output   :   Area of rectangle is 51.834000
//
//////////////////////////////////////////////////////////////////////////////