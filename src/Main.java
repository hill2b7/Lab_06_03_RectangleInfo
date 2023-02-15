import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        double length = 0; //variable declaration
        double width = 0; // variable declaration
        double area = 0;//variable declaration
        double perimeter = 0;//variable declaration
        double diagonal = 0; //variable declaration
        String trash = "";//String declaration

        Scanner in = new Scanner(System.in); //import of Java Scanner

        System.out.println("Enter the length of the rectangle: "); //output to ask the user for their input
        if (in.hasNextDouble()) //if the user's input is a Double then it will execute the code block below
        {
            length = in.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble(); //sets the double input received to width
                area = length * width; //formula for area
                perimeter = length * 2 + width * 2; //formula for perimeter
                diagonal = Math.sqrt((length * length)+(width*width));
                System.out.println("The area of the rectangle is " + area); //output that tells the user what the area is
                System.out.println("The perimeter of the rectangle is " + perimeter); //output that tells the user what the perimeter is
                System.out.println("The diagonal length is " + diagonal);
            }
            else
            {
                trash = in.nextLine();//sets trash variable to the string input that was received
                System.out.println("You entered an incorrect value" + trash);// output that tells the user the input was bad
            }
        }
        else // if the input of the length is incorrect, the code block below will run
        {
            trash = in.nextLine(); //sets trash variable to the string input that was received
            System.out.println("You entered an incorrect value " + trash); // output that tells the user the input was bad
        }
    }
}