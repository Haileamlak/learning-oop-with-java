package EMPLOYEE;

public class Clerk extends Employee {
    Clerk(int id, String aName, String aDept, double aSalary) {
        super(id, aName, aDept, aSalary);
    }

    @Override
    public double addBonus() {
        setSalary(getSalary() + 100);
        return getSalary();
    }

    @Override
    public String toString() {
        return ("Clerk :- ID = " + getID() + " : name = " + getName() + " : department = " + getDept() + " : salary = "
                + getSalary());
    }
    
    @Override
    public boolean equals(Object obj) {
        if ((obj.getClass() != getClass()) || obj == null)
            return false;
        Clerk emp = (Clerk) obj;
        return (getID() == emp.getID() && getDept() == emp.getDept() && getName() == emp.getName()
                && getSalary() == emp.getSalary());
    }
}
