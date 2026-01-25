package curriculum.j;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        int normalHours = Math.min(hoursWorked, 8);
        int overtimeHours = Math.max(hoursWorked - 8, 0);

        int normalPay = normalHours * 1250;
        int overtimePay = (int) (overtimeHours * 1250 * 1.25);

        return normalPay + overtimePay;
    }
}
