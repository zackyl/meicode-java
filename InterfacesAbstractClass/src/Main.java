import abstracts.TestAbstractClass;
import abstracts.TestClass;
import interfaces.CarInterface;
import interfaces.ElectricCar;
import interfaces.FossilFuelCar;

public class Main {
    public static void main(String[] args) {
//        CarInterface carInterface = new ElectricCar("Tesla");
//        carInterface.start();
//        carInterface.move(60);
//
////        List<String> names = new ArrayList<>();
//        CarInterface fossilCarInterface = new FossilFuelCar("Mercedes");
//        fossilCarInterface.start();
//        fossilCarInterface.move(100);

        TestAbstractClass testAbstractClass = new TestClass("bob");
        testAbstractClass.printName("Mason");
    }
}