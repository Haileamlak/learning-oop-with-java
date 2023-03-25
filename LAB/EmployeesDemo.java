import java.util.Scanner;

public class EmployeesDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of hourly employees you hired : ");
        int eNum = keyboard.nextInt();
        String fname, lname;
        int id, hours, hourlyRate;
        HourlyEmployee[] employees = new HourlyEmployee[eNum];
        for (HourlyEmployee hourlyEmployee : employees) {
            hourlyEmployee = new HourlyEmployee();
        }
        for (int i = 0; i < eNum; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Registering employee " + (i + 1));
            System.out.print("First name : ");
            fname = keyboard.next();
            System.out.print("Last name : ");
            lname = keyboard.next();
            System.out.print("ID number : ");
            id = keyboard.nextInt();
            System.out.print("number of working hours : ");
            hours = keyboard.nextInt();
            System.out.print("hourly rate for wage : ");
            hourlyRate = keyboard.nextInt();
            employees[i] = new HourlyEmployee(fname, lname, id, hours, hourlyRate);
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int c = 1;
        for (HourlyEmployee hourlyEmployee : employees) {
            System.out.println("Employee "+c);
            System.out.println(hourlyEmployee);
            c++;
        }
        keyboard.close();
    }
}
