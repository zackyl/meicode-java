package org.zackyl.oop1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 15, 8, 8);
//        iPhone.setName("iPhone 11");
        System.out.println(iPhone.getName());
        iPhone.playMusic("Our wings are burning");
        iPhone.playMusic("Lmaneting kiss");

        Phone pixel = new Phone("Pixel 3", 16);

    }
}