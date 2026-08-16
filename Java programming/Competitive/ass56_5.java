import java.util.*;

class ass56_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rows = 0;
        int cols = 0;
        int bookedCount = 0;
        int requestCount = 0;

        System.out.println("Enter number of rows");
        rows = sobj.nextInt();

        System.out.println("Enter number of columns");
        cols = sobj.nextInt();

        int totalSeats = rows * cols;

        int booked[] = new int[totalSeats];
        int requested[] = new int[totalSeats];

        System.out.println("Enter number of already booked seats");
        bookedCount = sobj.nextInt();

        System.out.println("Enter booked seat numbers");

        for(int i = 0; i < bookedCount; i++)
        {
            booked[i] = sobj.nextInt();
        }

        System.out.println("Enter number of requested seats");
        requestCount = sobj.nextInt();

        System.out.println("Enter requested seat numbers");

        for(int i = 0; i < requestCount; i++)
        {
            requested[i] = sobj.nextInt();
        }

        // Check requested seats
        boolean success = true;

        for(int i = 0; i < requestCount; i++)
        {
            if(requested[i] < 1 || requested[i] > totalSeats)
            {
                success = false;
                System.out.println(
                    "Invalid seat number : " + requested[i]);
                break;
            }

            for(int j = 0; j < bookedCount; j++)
            {
                if(requested[i] == booked[j])
                {
                    success = false;

                    System.out.println(
                        "Seat already booked : " +
                        requested[i]);

                    break;
                }
            }

            // Check duplicate requested seats
            for(int j = 0; j < i; j++)
            {
                if(requested[i] == requested[j])
                {
                    success = false;

                    System.out.println(
                        "Seat requested more than once : " +
                        requested[i]);

                    break;
                }
            }
        }

        if(success == true)
        {
            float totalCost = 0.0f;

            for(int i = 0; i < requestCount; i++)
            {
                int seat = requested[i];

                // Find row
                int row = (seat - 1) / cols;

                // Row 0 = ₹200
                // Row 1 = ₹250
                // Row 2 = ₹300
                // etc.

                float price = 200 + (row * 50);

                totalCost = totalCost + price;
            }

            // Group discount
            if(requestCount >= 6)
            {
                totalCost = totalCost -
                            (totalCost * 0.10f);

                System.out.println(
                    "10% Group Discount Applied");
            }

            System.out.println("Booking Successful");
            System.out.println("Total Cost = " + totalCost);

            int remainingSeats =
                totalSeats - bookedCount - requestCount;

            System.out.println(
                "Remaining Seats = " + remainingSeats);
        }
        else
        {
            System.out.println("Booking Failed");
        }
    }
}