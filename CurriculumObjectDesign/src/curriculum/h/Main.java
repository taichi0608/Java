package curriculum.h;

public class Main {

    public static void main(String[] args) {

        // 正社員のオブジェクト生成
        Employee fullTime = new FullTimeEmployee("E001", "山田太郎");

        // パート社員のオブジェクト生成
        Employee partTime = new PartTimeEmployee("P001", "佐藤花子");

        int hoursWorked = 9;

        // 正社員の給与を出力
        System.out.println("正社員の給与: " + fullTime.calculateDailyWage(hoursWorked) + " 円");

        // パート社員の給与を出力
        System.out.println("パート社員の給与: " + partTime.calculateDailyWage(hoursWorked) + " 円");
    }
}
