import java.util.Scanner;

public class Game extends Card {
    public Game(int x, int y) {
        super(x + y);
        System.out.println(x + y);

    }
    public void games() {
        System.out.println(super.toString());
    }
    public static void main(String[] args) {
        Card[][] cards = new Card[4][4];
        for (int j = 0; j < cards.length; j++)
            for (int i = 0; i < cards[j].length; i += 2) {
                cards[j][i] = new Card(i + 1);
                cards[j][i + 1] = new Card(i + 1);
            }
        play(cards);

    }

    public static void play(Card[][] cards) {
        print(cards);
        Scanner keyboard = new Scanner(System.in);
        int x1, y1, x2, y2, cardsUp = 0;
        while (cardsUp != 16) {
            print(cards);
            System.out.println("Choose two cards using the corresponding indexes given to face up.");
            System.out.println("Card 1 x-index : ");
            x1 = keyboard.nextInt() - 1;
            System.out.println("Card 1 y-index : ");
            y1 = keyboard.nextInt() - 1;
            System.out.println("Card 2 x-index : ");
            x2 = keyboard.nextInt() - 1;
            System.out.println("Card 2 y-index : ");
            y2 = keyboard.nextInt() - 1;
            if ((x1 < 0 || x1 > 3) || (x2 < 0 || x2 > 3) || (y1 < 0 || y1 > 3) || (y2 < 0 || y2 > 3)
                    || cards[x1][y1].cardFace == FACE.UP || cards[x2][y2].cardFace == FACE.UP) {
                System.out.println("error : Invalid input! try again");
                continue;
            }
            print(cards, x1, y1, x2, y2);
            if ((cards[x1][y1].cardValue != cards[x2][y2].cardValue)
                    || (cards[x1][y1].cardFace != cards[x2][y2].cardFace)) {
                System.out.println("Sorry they don't match. we need to face down them");
                print(cards);
            } else {
                cards[x1][y1].cardFace = FACE.UP;
                cards[x2][y2].cardFace = FACE.UP;
                cardsUp += 2;
            }
        }
        System.out.println("Congratulations! You won!");
        keyboard.close();

    }

    public static void print(Card[][] cards, int x1, int y1, int x2, int y2) {

        System.out.println("      1  2  3  4 ");
        System.out.println();
        for (int i = 0; i < cards.length; i++) {
            System.out.print(" " + (i + 1) + "   ");
            for (int j = 0; j < cards[i].length; j++) {
                if ((i == x1 && j == y1) || (i == x2 && j == y2) || (cards[j][i].cardFace == FACE.UP))
                    System.out.print(" " + cards[i][j].cardValue + " ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void print(Card[][] cards) {

        System.out.println("      1  2  3  4 ");
        System.out.println();
        for (int i = 0; i < cards.length; i++) {
            System.out.print(" " + (i + 1) + "   ");
            for (int j = 0; j < cards[i].length; j++) {
                if ((cards[j][i].cardFace == FACE.UP))
                    System.out.print(" " + cards[i][j].cardValue + " ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
