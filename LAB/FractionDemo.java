package LAB;

import java.util.Scanner;

/**
 * FractionDemo
 */
public class FractionDemo {

    public static void main(String[] args) {
        Scanner keybScanner = new Scanner(System.in);
        
        // System.out.println("Creating the first fraction number!");
        // System.out.println("Enter the numerator : ");
        // int num1 = keybScanner.nextInt();
        // System.out.println("Enter the denomirator : ");
        // int denum1 = keybScanner.nextInt();
        // Fraction f1 = new Fraction(num1, denum1);
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        // System.out.println("Creating the second fraction number!");
        // System.out.println("Enter the numerator : ");
        // int num2 = keybScanner.nextInt();
        // System.out.println("Enter the denomirator : ");
        // int denum2 = keybScanner.nextInt();
        // Fraction f2 = new Fraction(num2, denum2);
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        // System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        // System.out.println(f1 + " - " + f2 + " = " + f1.sub(f2));
        // System.out.println(f1 + " * " + f2 + " = " + f1.mult(f2));
        // System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 5);

        Fraction fsum = f1.add(f2);
        Fraction fsum2 = f1.add(4); //4/1
        keybScanner.close();
    }
}
    











        // Fraction[] arr = new Fraction[5];
        // arr[0] = new Fraction(1, 2);
        // arr[2] = new Fraction(3, 4);
        // arr[3] = new Fraction(5, 6);
        // arr[1] = new Fraction(7, 8);
        // arr[4] = new Fraction(9, 10);
// System.out.println(f1.compareTo(f2));