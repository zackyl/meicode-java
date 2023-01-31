import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5;
//        for (int i = 0; i < a; i++) {
//            System.out.println("Hello " + i);
//        }

//        while (a < 10) {
//            a++;
//            if (a == 8) {
//                continue;
//            }
//            System.out.println("Hello" + a);
//        }

//        do {
//            System.out.println("Hello " + a);
//        } while (a < 5);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: " + answer);
//        System.out.println("Enter your name: " + answer);
//        String name = scanner.next();
//        System.out.println("Hello: " + name);

        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println(number);
    }
}