import organ.*;
import patient.Patient;

import java.util.Scanner;

public class MainClass {

    static final Scanner scanner = new Scanner(System.in);
    // doesn't seem to work since I can't access main class static variables in other classes
    public static void main(String[] args) {
        Organ[] organs = {new Eye("Left Eye", "Short sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Blue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", "Need to be fed", false),
                new Skin("Skin", "Burned", "Brown", 5)
        };
        Patient patient = new Patient("Tom", 25, organs);
        patient.printIntro();
        patient.printChoices();
//        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (patient.activateOrgan(choice)) {
            patient.printChoices();
            choice = scanner.nextInt();
        }


    }
}