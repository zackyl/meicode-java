public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine("Renault", 8000);
//        Car mercedes = new Car("Mercedes AMG", 2, "silver", engine);
//        Car mercedes = new Car("Mercedes AMG", 2, "silver", new Engine("Renault", 8000));
//        System.out.println(mercedes.getName());
//        Engine engine = mercedes.getEngine();
//        System.out.println("Engine Model " + mercedes.getEngine().getModel());

//        Car mercedes = null;
//        if (mercedes != null) {
//            mercedes.getEngine();
//        } else {
//            System.out.println("The car was null");
//        }

//        final int a = 5;
//        a++;
        final Engine engine = new Engine("Renault", 8000);
//        engine = new Engine("Renault", 7000);
        engine.setRpm(10000);
    }
}