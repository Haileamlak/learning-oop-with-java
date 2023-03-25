enum DELPLACE {
    INSIDE, OUTSIDE
};

public class Parcel {
    public double weight;
    public int stamp;
    DELPLACE place;

    public Parcel() {
        weight = 0.0;
        stamp = 0;
        place = null;
    }

    public Parcel(double weight, DELPLACE place) {
        this.weight = weight;
        this.place = place;
        this.stamp = calc_stamp(weight, place);
    }

    public static int calc_stamp(double weight, DELPLACE place) {
        if (place == DELPLACE.INSIDE)
            return (int) Math.ceil(weight) * 2 + 20;
        return (int) Math.ceil(weight) * 2 + 40;
    }
}
