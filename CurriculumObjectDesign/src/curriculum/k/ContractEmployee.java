package curriculum.k;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculateSalary() {
        return hours * 1000;
    }
}

