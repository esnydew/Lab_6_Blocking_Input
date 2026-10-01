import java.util.Scanner;

/** Takes number of gallons of gas in a tank, fuel efficiency in miles per gallon, and the price of gas per gallon. Outputs the cost to drive 100 miles, as well as how far the car can go with a full tank of gas. */

public class FuelCosts {
    static void main() {
        // Declarations
            Scanner in = new Scanner(System.in);
            double gasTankCapacity = 0;
            double fuelEfficiency = 0;
            double gasPrice = 0;
            double longDriveCost = 0;
            double fullTankDistance = 0;
            String trash = "";
            boolean valid = false;
        // IPO
        do {
            System.out.print("Please enter how many gallons your gas tank can hold (only the number please!)>> ");
            if(in.hasNextDouble()) {
                gasTankCapacity = in.nextDouble();
                in.nextLine();
                valid = true;
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.println("That's not a valid number! Please enter a valid number, and only a number!");
            }
        } while(!valid);
        valid = false;
        do {
            System.out.print("Please enter the fuel efficiency of your vehicle in miles per gallon (only the number please!)>> ");
            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                valid = true;
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.println("That's not a valid number! Please enter a valid number, and only a number!");
            }
        } while(!valid);
        valid = false;
        do {
            System.out.print("Please enter the cost of gas per gallon in US Dollars (only the number please!)>> ");
            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                valid = true;
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.println("That's not a valid number! Please enter a valid number, and only a number!");
            }
        } while(!valid);
        longDriveCost = gasPrice * (100 / fuelEfficiency);
        fullTankDistance = fuelEfficiency * gasTankCapacity;
        System.out.printf("The cost of driving 100 miles in your vehicle is $%.2f. The distance one full tank of gas could take your vehicle is %.2f miles.%n", longDriveCost, fullTankDistance);
    }
}
