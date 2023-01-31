import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Please enter a name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello: " + name);
        int answer;
        do {
            System.out.println("Should we start the game?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            answer = scanner.nextInt();
        } while (answer != 1);

        Random random = new Random();
        int number = random.nextInt(20);
        int guess = -1;
        System.out.println("Enter a guess for a number up to 20!");
        for (int i = 0; i < 5; i++) {
            guess = scanner.nextInt();
            if (guess != number) {
                System.out.println("That is not the number!");
                if (guess < number) {
                    System.out.println("Your guess was too low");
                } else {
                    System.out.println("Your guess was too high");
                }
            } else {
                break;
            }
        }
        if (guess == number) {
            System.out.println("You have guessed the right number!");
        } else {
            System.out.println("You have run out of guesses!");
            System.out.println("The number was " + number);
        }
    }
}