public class HourlyEmployee extends Employee {
    private int hours;
    private int hourlyRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String fname, String lname, int id, int aHours, int aHourlyRate) {
        super(fname, lname, id);
        setHours(aHours);
        setHourlyRate(aHourlyRate);
    }

    public int getHours() {
        return hours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 200) {
            System.out.println("Error : unexpected working hour");
            System.exit(1);
        }
        this.hours = hours;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            System.out.println("Error : unexpected hourly rate");
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return ("First name = " + super.getfName() + "\n" +
                "Last name = " + super.getlName() + "\n" +
                "ID number = " + super.getID() + "\n" +
                "Working hours = " + getHours() + "\n" +
                "Rate per Hour = " + getHourlyRate() + "\n\n");
    }
}
