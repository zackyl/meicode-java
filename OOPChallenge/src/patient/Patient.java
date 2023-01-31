package patient;

import organ.Organ;

public class Patient {
    private String name;
    private int age;
    private Organ organs[];

    public Patient(String name, int age, Organ[] organs) {
        this.name = name;
        this.age = age;
        this.organs = organs;
    }

    public void printIntro() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void printChoices() {
        System.out.println("Choose an organ:");
        int i = 0;
        for (; i < organs.length; i++) {
            System.out.println("\t" + (i + 1) + ". " + organs[i].getName());
        }
        System.out.println("\t" + (i + 1) + ". Quit");
    }

    public boolean activateOrgan(int choice) {
        choice--;
        if (choice >= 0 && choice < organs.length) {
            organs[choice].printCondition();
            organs[choice].action();
            return true;
        } else return choice != organs.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Organ[] getOrgans() {
        return organs;
    }

    public void setOrgans(Organ[] organs) {
        this.organs = organs;
    }
}
