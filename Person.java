
public class Person {
    String fName;
    String lName;

    public String toString()
    {
        return (fName + " " + lName);
    }
    public Person(String afName, String alName) {
        fName = afName;
        lName = alName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void SetfName(String afName) {
        fName = afName;
    }

    public void SetlName(String alName) {
        lName = alName;
    }

    public void displayDetails() {
        System.out.println(this.toString());
    }

}
