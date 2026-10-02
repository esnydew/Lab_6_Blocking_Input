import java.util.Scanner;
import java.util.Random;

/** A program that generates a random integer from 1 to 10 then asks the user to guess the number in a single guess. Then, it displays the random number and tells the user where their guess was high, low, or correct. */

public class HighOrLow {
    static void main() {
        // Declarations
            Scanner in = new Scanner(System.in);
            Random gen = new Random();
            int randomNum = gen.nextInt(10) + 1;
            int userGuess = 0;
            String trash = "";
            boolean valid = false;
        // IPO
        System.out.println("I have a random number between 1 and 10, including them. Your goal is to guess this random number in one try.");
        do {
            System.out.print("Please enter your one guess (must be a whole number from 1 to 10)>> ");
            if(in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();
                if(userGuess >= 1 && userGuess <= 10) {
                    valid = true;
                } else {
                    System.out.printf("You entered: %s.%n", userGuess);
                    System.out.printf("%s is not a valid number! Please enter a number within the allotted range (1 to 10).%n", userGuess);
                }
            } else {
                trash = in.nextLine();
                System.out.printf("You entered: %s.%n", trash);
                System.out.printf("%s is not a valid number! Please enter a valid whole number (integer).%n", trash);
            }
        } while(!valid);
        System.out.printf("Your guess was: %d.%n", userGuess);
        System.out.printf("The random num was: %d.%n", randomNum);
        if(userGuess != randomNum) {
            if (userGuess > randomNum) {
                System.out.printf("Your guess (%d) was higher than the random number (%d)!%n", userGuess, randomNum);
            } else {
                System.out.printf("Your guess (%d) was lower than the random number (%d)!%n", userGuess, randomNum);
            }
        } else {
            System.out.printf("Well done! Your guess (%d) was spot on correct with the random number (%d)!%n", userGuess, randomNum);
        }
    }
}