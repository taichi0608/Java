package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 社員リストを Employee 型で作成
        List<Employee> employees = new ArrayList<>();

        // 既存クラスをそのまま利用
        employees.add(new FullTimeEmployee("E001", "山田太郎"));
        employees.add(new FullTimeEmployee("E002", "田中花子"));
        employees.add(new ContractEmployee("C001", "佐藤花子"));
        employees.add(new ContractEmployee("C002", "鈴木次郎"));

        int hoursWorked = 8;

        // for-each で給与を出力（サブクラスを意識しない）
        for (Employee e : employees) {
            System.out.println(
                e.name + "の給与: " +
                e.calculateDailyWage(hoursWorked) + " 円"
            );
        }
    }
}
