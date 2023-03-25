enum FACE {
    UP, DOWN
};

public class  Card {
    FACE cardFace;
    int cardValue;

    public Card(int value) {
        cardValue = value;
        cardFace = FACE.DOWN;
    }

    public Card(int value, FACE face) {
        cardValue = value;
        cardFace = face;
    }
    public final int getValue() {
        return cardValue;
    }
}
