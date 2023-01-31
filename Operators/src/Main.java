public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;

//        boolean answer = a != b;
//        System.out.println(answer);
//        boolean answer = a == 5 && b == 2;
//        System.out.println(answer);

//        if (a > 3) {
//            System.out.println("A is greater than 3");
//        } else if (a == 3) {
//            System.out.println("A is equal to 3");
//        } else {
//            System.out.println("A is less than 3");
//        }
        switch (a) {
            case 1:
                System.out.println("A is one");
                break;
            case 2:
                System.out.println("A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is not one, two or three");
                break;
        }
        System.out.println("Continue...");
    }
}