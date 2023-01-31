package organ;

import java.util.Scanner;

public abstract class Organ {
    private String name;
    private String condition;

    Scanner scanner = new Scanner(System.in);

    public void printCondition() {
        System.out.println("Name: " + name);
        System.out.println("Medical Condition " + condition);
        additionalCondition();
    }
    protected void additionalCondition() {

    }

//    public void loopAction() {
//        while(!action());
//    }

    public void action() {

    }
    public Organ(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
