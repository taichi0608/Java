package curriculum.b;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Q1
        int score = 75;
        if (score >= 60) {
            System.out.println("合格です！");
        }

        // Q2
        int age = 25;
        if (age >= 20 && age <= 30) {
            System.out.println("適正年齢です");
        } else {
            System.out.println("対象外です");
        }

        // Q3
        age = 18;
        if (age >= 20) {
            System.out.println("成人です");
        } else if (age >= 13 && age <= 19) {
            System.out.println("ティーンエイジャーです");
        } else {
            System.out.println("子供です");
        }

        // Q4
        int x = 30;
        int y = 15;
        int z = 50;

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println("一番大きい数値: " + max);

        // Q5
        System.out.print("数値を入力してください: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0です");
        } else {
            System.out.println("負の数です");
        }

        // Q6
        System.out.print("数値を入力してください: ");
        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        // Q7
        System.out.print("点数を入力してください（0～100）: ");
        score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("優");
        } else if (score >= 70) {
            System.out.println("良");
        } else if (score >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        // Q8
        scanner.nextLine(); // 改行クリア
        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        }

        // Q9
        System.out.print("曜日番号を入力してください（1～7）: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
            default:
                System.out.println("無効な入力です");
        }

        // Q10
        System.out.print("月を入力してください（1～12）: ");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            default:
                System.out.println("無効な月です");
        }

        scanner.close();
    }
}
