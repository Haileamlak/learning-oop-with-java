package LAB;

public class Course {
    private int cId;
    private String cTitle;
    private int creditHour;

    public Course(int cid, String cTitle, int chr)
    {
        setcId(cid);
        setcTitle(cTitle);
        setCreditHour(chr);
    }

    public int getcId() {
        return cId;
    }

    public String getcTitle() {
        return cTitle;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

}
