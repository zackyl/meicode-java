package organ;
//import MainClass;
public class Stomach extends Organ {
    private String stomachCondition;
    private boolean isEmpty;


    public Stomach(String name, String condition, String stomachCondition, boolean isEmpty) {
        super(name, condition);
        this.stomachCondition = stomachCondition;
        this.isEmpty = isEmpty;
    }

    public Stomach(String name, String condition, String stomachCondition) {
        super(name, condition);
        this.stomachCondition = stomachCondition;
        this.isEmpty = true;
    }

    @Override
    protected void additionalCondition() {
        if (isEmpty()) {
            System.out.println("Needs to be fed");
        } else {
            System.out.println("Stomach is full");
        }
    }

    public void digest() {
        System.out.println("digesting begin...");
    }

    @Override
    public void action() {
        System.out.println("\t1. Digest");
//        MainClass.scanner
        if (scanner.next().equals("1")) {
            digest();
        }
    }

    public String getStomachCondition() {
        return stomachCondition;
    }

    public void setStomachCondition(String stomachCondition) {
        this.stomachCondition = stomachCondition;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
