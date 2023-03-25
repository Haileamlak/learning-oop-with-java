package EMPLOYEE;

import javax.swing.JFrame;

public abstract class Employee {
    private int ID;
    private String name;
    private String Dept;
    private double salary;

    public abstract double addBonus();

    public void display(){
        System.out.println(toString());
    }

    Employee(int id, String aName, String aDept, double aSalary) {
        setDept(aDept);
        setID(id);
        setName(aName);
        setSalary(aSalary);
    }
    public String getDept() {
        return Dept;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj.getClass() != getClass()) || obj == null)
            return false;
        Employee emp = (Employee) obj;
        return (ID == emp.ID && Dept == emp.Dept && name == emp.name && salary == emp.salary);
    }
    public static void main(String[] args) {
        Employee emp = new Manager(123, "Abebe", "Computer Science", 2500);
        Manager mng = new Manager(123, "Abebe", "Computer Science", 2500);
        Clerk clk = new Clerk(123, "Abebe", "Computer Science", 2500);
        mng.display();
        clk.display();
        // mng.addBonus();
        // clk.addBonus();
        // mng.display();
        // clk.display();
        System.out.println(emp.equals(clk));
        System.out.println(emp.equals(mng));
        // System.out.println();
        JFrame fr1 = new JFrame();
        fr1.setSize(500, 300);
        fr1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr1.setVisible(true);

    }
}
