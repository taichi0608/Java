package curriculum.k;

public abstract class Employee implements Billable {

    protected String name;
    protected int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }
}

