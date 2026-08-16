import java.util.*;

class ass55_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int distance = 0;
        int classType = 0;
        int bookingHoursBefore = 0;
        int age = 0;

        float baseFare = 0.0f;
        float classCharge = 0.0f;
        float tatkalCharge = 0.0f;
        float discount = 0.0f;
        float finalFare = 0.0f;

        System.out.println("Enter distance");
        distance = sobj.nextInt();

        System.out.println("Enter class type");
        System.out.println("1 : Sleeper");
        System.out.println("2 : 3AC");
        System.out.println("3 : 2AC");
        classType = sobj.nextInt();

        System.out.println("Enter booking hours before journey");
        bookingHoursBefore = sobj.nextInt();

        System.out.println("Enter age");
        age = sobj.nextInt();

        if(distance < 0 || bookingHoursBefore < 0 || age < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        // Distance slab
        if(distance <= 100)
        {
            baseFare = 100;
        }
        else if(distance <= 500)
        {
            baseFare = 300;
        }
        else if(distance <= 1000)
        {
            baseFare = 600;
        }
        else
        {
            baseFare = 1000;
        }

        // Class charge
        if(classType == 1)
        {
            classCharge = 100;
        }
        else if(classType == 2)
        {
            classCharge = 500;
        }
        else if(classType == 3)
        {
            classCharge = 800;
        }
        else
        {
            System.out.println("Invalid class type");
            return;
        }

        finalFare = baseFare + classCharge;

        // Tatkal charge
        if(bookingHoursBefore <= 24)
        {
            tatkalCharge = finalFare * 0.30f;
            finalFare = finalFare + tatkalCharge;
        }

        // Senior citizen discount
        if(age >= 60)
        {
            discount = finalFare * 0.40f;
            finalFare = finalFare - discount;
        }

        System.out.println("Base Fare = " + baseFare);
        System.out.println("Class Charge = " + classCharge);
        System.out.println("Tatkal Charge = " + tatkalCharge);
        System.out.println("Senior Citizen Discount = " + discount);
        System.out.println("Final Fare = " + finalFare);
    }
}