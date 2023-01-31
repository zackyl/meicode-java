import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] students = new String[5];
//        students[1] = "Zack";
//        students[0] = "Sarah";
//        students[2] = "Tom";
//        students[3] = "Brad";
//        students[4] = "Madeline";
//        System.out.println(students[2]);
//        String[] employees = {"a", "b", "c"};
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
        String[] names = {"mesia", "sarah", "tom", "brad", "brian"};
        int[] numbers = {1234, 12323, 2343, 4545, 4353453};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("please enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }
    }
}