package curriculum.k;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculateSalary() {
        return hours * 1200;
    }
}

