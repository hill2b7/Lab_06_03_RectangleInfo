import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                area = length * width;
                perimeter = length * 2 + width * 2;
                System.out.println("The area of the rectangle is " + area);
                System.out.println("The perimeter of the rectangle is " + perimeter);

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an incorrect value" + trash);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect value " + trash);
        }
    }
}