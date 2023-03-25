public class Check extends Car {
    private boolean carSafety;
    private int xx;

    public Check(String nm, String mod, int spe, boolean safe) {
        super(nm, mod, spe);
        carSafety = safe;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        // if (!(obj instanceof Check))
        //    return false;
        if (obj.getClass() != getClass())
            return false;
        Check tempCheck = (Check) obj;
        return (tempCheck.carSafety == carSafety);// ...
    }

    public void setNo() {
        xx = no;
    }

    public static void main(String[] args) {
        Check tell = new Check("vitz", "y", 21, true);
        Check hear = new Check("vitz", "y", 21, true);
        // System.out.println(tell.getname());
        // tell.setter("Ford");
        // System.out.println(tell.getname());
        // tell.settmodel("h");
        // System.out.println(tell.getmodel());
        System.out.println(tell.equals(hear));
    }
}
