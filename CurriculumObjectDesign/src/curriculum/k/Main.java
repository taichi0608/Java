package curriculum.k;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Billable> employees = List.of(
            new FullTimeEmployee("山田", 160),
            new ContractEmployee("田中", 160)
        );

        SalaryCalculator calculator = new SalaryCalculator();
        SalaryPrinter printer = new SalaryPrinter();

        for (Billable e : employees) {
            int salary = calculator.calculate(e);
            printer.print(e, salary);
        }
    }
}

