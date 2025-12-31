package curriculum.f;

public class Main {

	public static void main(String[] args) {
        // Employeeクラスのインスタンス生成
        Employee emp = new Employee();
        
        // フィールドに値を設定
        emp.employeeId = "E001";
        emp.name = "佐藤太郎";
        
        // 情報を表示
        emp.showInfo();
    }

}
