import java.util.Scanner;
import java.lang.Math; // Had to look this up to figure out how to square root and calculate exponents

/** A program that takes input for the width and height of a rectangle and outputs area, perimeter, and the length of a diagonal. */

public class RectangleInfo {
    static void main() {
        // Declarations
            Scanner in = new Scanner(System.in);
            double width = 0;
            double height = 0;
            double area = 0;
            double perimeter = 0;
            double diagonal = 0;
            String trash = "";
            boolean valid = false;
        // IPO
        do {
            System.out.print("Please enter the width in inches of your rectangle (just the number)>> ");
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                valid = true;
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.printf("'%s' is not a valid input! You must enter a number.%n", trash);
            }
        } while(!valid);
        valid = false;
        do {
            System.out.print("Please enter the height in inches of your rectangle (just the number)>> ");
            if(in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                valid = true;
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.printf("'%s' is not a valid input! You must enter a number.%n", trash);
            }
        } while(!valid);
        area = width * height;
        perimeter = (width * 2) + (height * 2);
        diagonal = Math.sqrt(Math.pow(width, 2) + (Math.pow(height, 2)));
        System.out.printf("The area of the rectangle is %.2f inches squared. The perimeter of the rectangle is %.2f inches. The diagonal of the rectangle is %.2f inches.%n", area, perimeter, diagonal);
    }
}
