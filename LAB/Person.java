// package LAB;

import java.util.Scanner;

class Person {
    private int AGE;
    private String name;

    public Person() {
        System.out.println("You have successfully created a Person.");
    }

    public Person(int age, String aName) {
        AGE = age;
        name = aName;
    }

    public void setAge(int age) {
        AGE = age;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getAge() {
        return AGE;
    }

    public String getName() {
        return name;
    }

    public void accept() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name and age respectively : ");
        name = keyboard.next();
        AGE = keyboard.nextInt();
        keyboard.close();
    }
}