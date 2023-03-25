import java.util.Scanner;

public class Trial {
    static Scanner keyboard = new Scanner(System.in);

    enum DIRECTION {
        LEFT, RIGHT, TOP, BOTTOM
    }

    private int[] x;

    public static void main(String[] args) {
        DIRECTION X = DIRECTION.BOTTOM;
        System.out.println(X);
        X.equals(DIRECTION.BOTTOM);
        DIRECTION[] sss = new DIRECTION[4];
        sss = DIRECTION.values();
        if(X == DIRECTION.BOTTOM)
            System.out.println(X.ordinal());
            for (int i = 0; i < sss.length; i++)
                System.out.println(sss[i]);
        switch (X) {
            case BOTTOM:

                break;

            default:
                break;
        }
        int[] temp = increment_by(2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 88, 7);
        for (int j : temp)
            System.out.println(j);
        Trial a = new Trial();
        int c = a.x[0];
    }

    public static int[] increment_by(int inc, int... args) {
        for (int i = 0; i < args.length; i++) {
            args[i] += inc;
        }
        return args;
    }

    public static void compute() {

    }

    public static void mile_to_km() {
        System.out.println("Enter a number in miles to get its kilometer equivalent");
        double num = keyboard.nextInt();
        System.out.println(num + " miles is equivalent to " + (1.609 * num) + " kms.");
        keyboard.close();
    }
}
