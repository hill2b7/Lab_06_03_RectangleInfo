import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        double sideD = 0;
        double perimeter = 0;
        double area = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of side A: ");
        if (in.hasNextDouble())
        {
            sideA = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input for side A: " + trash);
        }
        System.out.println("Enter the length of side B: ");
        if (in.hasNextDouble())
        {
            sideB = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input for side B: " + trash);
        }

        System.out.println("Enter the length of side C: ");
        if (in.hasNextDouble())
        {
            if (sideC == sideA)
            {
                sideC = in.nextDouble();
            }
            else
            {
                System.out.println("A rectangle must have two equal sides ");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input for side C: " + trash);
        }
        System.out.println("Enter the length of side D: ");
        if (in.hasNextDouble())
        {
            if (sideB != sideD)
            {
                System.out.println("A rectangle must have two equal sides ");
            }
            else
            {
                sideD = in.nextDouble();
                perimeter = sideA + sideB + sideC + sideD;
                area = sideA * sideB;
                System.out.println("The perimeter is " + perimeter);
                System.out.println("The area is " + area);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input for side D: " + trash);
        }


    }
}