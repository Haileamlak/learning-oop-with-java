public class Employee {
    private String fName;
    private String lName;
    private int ID;

    public Employee() {

    }

    public Employee(String fname, String lname, int id) {
        setfName(fname);
        setlName(lname);
        setID(id);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getID() {
        return ID;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setID(int iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return getID() + " " + getfName() + " " + getlName();
    }
}
