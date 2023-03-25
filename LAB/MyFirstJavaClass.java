// package LAB;

import java.util.Scanner;

class MyFirstJavaClass {
    public static void main(String[] args) {
        Person newPerson = new Person();
        newPerson.accept();
        System.out.println(newPerson.getName() + " is " + newPerson.getAge() + " years old.");
    }

}
