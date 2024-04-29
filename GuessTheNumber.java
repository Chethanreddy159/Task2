import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1; // Minimum value for the random number
        int max = 100; // Maximum value for the random number
        int randomNumber = random.nextInt(max - min + 1) + min; // Generate random number between min and max

        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess the number between " + min + " and " + max + ".");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly!");
        System.out.println("Number of attempts: " + attempts);

        scanner.close();
    }
}
