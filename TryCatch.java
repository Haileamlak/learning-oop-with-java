import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void divisionTry() {
        int n1 = 1;
        try {
            Scanner keyBoard = new Scanner(System.in);
            System.out.println("enter num 1 :");
            n1 = keyBoard.nextInt();
            System.out.println("enter num 2 :");
            int n2 = keyBoard.nextInt();
            int div = n1 / n2;
            System.out.println("n1/n2 == " + div);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by 0.\n please try again");
            throw e;
        }
        finally {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            divisionTry();
        } catch (ArithmeticException e) {
            divisionTry();
        }
    }
}

// int n1=1;
// do {
// try {
// Scanner keyBoard = new Scanner(System.in);
// System.out.println("enter num 1 :");
// n1 = keyBoard.nextInt();
// System.out.println("enter num 2 :");
// int n2 = keyBoard.nextInt();
// int div = n1 / n2;
// System.out.println("n1/n2 == " + div);
// } catch (ArithmeticException | IndexOutOfBoundsException e) {
// System.out.println("cant divide by 0.\nplease enter again");
// }
// }while(n1>0);

// int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
// 2, 3, 3, 2, 14 };
// int[] frequency = new int[7];
// for (int answer = 0; answer < responses.length; answer++) {
// try {
// ++frequency[14];
// } catch (InputMismatchException e) {
// System.out.println(e);
// System.out.printf(" responses[%d]=%d%n%n",
// answer, responses[answer]);
// } finally {
// System.out.println("resdx");
// }

// }
// System.out.printf("%s%10s%n", "Rating", "Frequency");
// for (int rating = 1; rating < frequency.length; rating++)
// System.out.printf("%6d%10d%n", rating, frequency[rating]);
// }