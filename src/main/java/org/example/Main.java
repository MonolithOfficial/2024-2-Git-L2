package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    private static String somethingOnMasterHappened() {
        return "I HAPPENED";
    }

    private static void someFeature(){
        System.out.println("something");

    }

    private static void someKindOfStuff(){
        System.out.println("I AM CONFLICTING");
    }
}
