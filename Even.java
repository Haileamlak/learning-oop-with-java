import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int variable;
        System.out.println("please enter the number that you want to differentiate as even or odd");
        Scanner input = new Scanner(System.in);
        variable = input.nextInt();
        if (variable % 2 == 0) {
            System.out.println("the number " + variable + " is an even number");
        } else
            System.out.println("the number" + variable + "is an odd number");
        int x = (int)'a';
    }
}
