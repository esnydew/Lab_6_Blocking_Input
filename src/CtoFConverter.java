import java.util.Scanner;

/** A program to convert an inputted Celsius temperature to Fahrenheit.*/

public class CtoFConverter {
    static void main() {
        // Declarations
            Scanner in = new Scanner(System.in);
            double inputCelsius = 0;
            double resultFahrenheit = 0;
            String trash = "";
            boolean valid = false;
        // IPO
        do {
            System.out.print("Please enter a valid Celsius temperature as a number (just the number!)>> ");
            if(in.hasNextDouble()) {
                inputCelsius = in.nextDouble();
                in.nextLine(); // Clear buffer
                valid = true;
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.println("That's not a valid number! You must enter a temperature (in Celsius) as a number!");
            }
        } while(!valid);
        resultFahrenheit = (inputCelsius * 9 / 5) + 32;
        System.out.printf("The temperature %.2f degrees Celsius is equivalent to %.2f degrees Fahrenheit!%n", inputCelsius, resultFahrenheit);
    }
}
