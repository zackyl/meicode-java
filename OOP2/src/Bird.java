
public class Bird extends Animal {
    private int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed) {
        System.out.println(this.getName() + " is flying at " + speed + " speed");
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird is chewing food");
    }

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }
}
