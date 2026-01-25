package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Billable> employees = new ArrayList<>();

        // 社員を追加（型は気にしない）
        employees.add(new FullTimeEmployee("E001", "山田太郎"));
        employees.add(new ContractEmployee("E002", "田中花子"));
        employees.add(new FullTimeEmployee("E003", "佐藤次郎"));

        int hoursWorked = 10;

        // for-each で一括処理
        for (Billable b : employees) {
            System.out.println("日給: " + b.costForDay(hoursWorked));
        }
    }
}

