package curriculum.g;

public class Main {
    public static void main(String[] args) {
        // Employee オブジェクトの生成
        Employee emp = new Employee();

        // フィールドに値を設定
        emp.setEmployeeId("E002");
        emp.setName("田中花子");

        // 1行で出力
        System.out.println("社員ID: " + emp.getEmployeeId() + ", 名前: " + emp.getName());
    }
}


