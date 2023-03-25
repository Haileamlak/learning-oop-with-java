package EMPLOYEE;

public class Manager extends Employee {
    Manager(int id, String aName, String aDept, double aSalary) {
        super(id, aName, aDept, aSalary);
    }

    @Override
    public double addBonus() {
        setSalary(getSalary() + 300);
        return getSalary();
    }

    @Override
    public String toString() {
        return ("Manager :- ID = " + getID() + " : name = " + getName() + " : department = " + getDept()
                + " : salary = "
                + getSalary());
    }
    
    @Override
    public boolean equals(Object obj) {
        if ((obj.getClass() != getClass()) || obj == null)
            return false;
        Manager emp = (Manager) obj;
        return (getID() == emp.getID() && getDept() == emp.getDept() && getName() == emp.getName() && getSalary() == emp.getSalary());
    }
}
