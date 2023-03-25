
import java.util.*;
import java.util.StringTokenizer;

public class First {
    int fs;// int - Integer // double - Doubs
    char ls;
    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) { 
        System.out.println(args[0] + args[1] + args[2]);
        char[] a = new char[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (char) (65 + i);
            System.out.println(a[i]);
        }
        String s = new String(a);
        System.out.println(a);
        s = new String(a, 2, 5);
        System.out.println(s);
        int[] temp = array();
        for (int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println(temp);
        System.out.println("finished");
        First[] temp2 = new First[10];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = new First();
        }
        temp2 = name();
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i].fs + " = " + temp2[i].ls);
        }
    }

    public static int[] array() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Keyboard.nextInt();
        return arr;
    }

    public static First[] name() {
        First[] one = new First[10];
        for (int i = 0; i < one.length; i++) {
            one[i] = new First();
        }
        for (int i = 0; i < one.length; i++) {
            one[i].fs = i + 48;
            one[i].ls = (char) (i + 48);
            System.out.println(one[i].fs + " = " + one[i].ls);
        }
        return one;
    }

    public static String correctName() {
        String line = null, temp = null, fine = new String();
        line = Keyboard.nextLine();
        StringTokenizer talk = new StringTokenizer(line);
        for (int i = 49, j = 1; j <= talk.countTokens(); i++, j++) {
            while (talk.hasMoreTokens()) {
                temp = talk.nextToken();
                if (temp.charAt(temp.length() - 1) == (char) i)
                    fine = fine + " " + temp.substring(0, temp.length() - 1);
            }
            talk = new StringTokenizer(line);
        }
        return fine;
    }

    public static double square_root(int num) {
        double r, prev = 0, guess = num / 2;
        for (; Math.abs(guess - prev) > 0.01 * prev;) {
            prev = guess;
            r = num / guess;
            guess = (guess + r) / 2;
        }
        return guess;
    }

    public static String Full_name(String fName, String lName) {
        fName = fName.toLowerCase();
        lName = lName.toLowerCase();
        String one = fName.substring(1, 2);
        one = one.toUpperCase();
        fName = one + fName.substring(2) + fName.charAt(0) + "ay";
        one = lName.substring(1, 2);
        one = one.toUpperCase();
        lName = one + lName.substring(2) + lName.charAt(0) + "ay";
        return fName + " " + lName;
    }

}

// String x = "Hayla";
// System.out.println(x);
// Scanner input = new Scanner(System.in);
// int y = input.nextInt();
// System.out.printf("%d", y++);
// System.out.print(y);
// input.close();
// DecimalFormat z = new DecimalFormat();
// System.out.println(z.format(34.44));
// String hi = "Hi there";
// System.out.println(hi.length());
// System.out.println(hi.equals("hi"));
// System.out.println(hi.equalsIgnoreCase("hi"));
// System.out.println(hi.trim());
// System.out.println(hi.charAt(0));
// System.out.println(hi.toLowerCase());
// System.out.println(hi.toUpperCase());
// System.out.println(hi.substring(2));
// System.out.println(hi.substring(2, 4));
// System.out.println(hi.indexOf('h'));
// System.out.println(hi.lastIndexOf('i'));
// System.out.println(hi.compareTo("compare"));
// System.out.println(hi.compareToIgnoreCase("book"));