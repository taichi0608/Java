package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // =====================
        // Q1〜Q5 for文
        // =====================
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int sumFor = 0;
        for (int i = 1; i <= 100; i++) {
            sumFor += i;
        }
        System.out.println("合計: " + sumFor);

        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }

        // =====================
        // Q6〜Q9 while文
        // =====================
        int num = 1;
        while (num <= 10) {
            System.out.println(num++);
        }

        int even = 2;
        while (even <= 20) {
            System.out.println(even);
            even += 2;
        }

        int down = 10;
        while (down >= 1) {
            System.out.println(down--);
        }

        int sumWhile = 0;
        int count = 1;
        while (count <= 100) {
            sumWhile += count++;
        }
        System.out.println("合計: " + sumWhile);

        // =====================
        // Q10 0入力で終了
        // =====================
        while (true) {
            System.out.print("数値を入力してください（0で終了）: ");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("終了しました");
                break;
            }
        }

        // =====================
        // Q11 九九
        // =====================
        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                System.out.printf("%02d * %02d = %02d",
                        first, second, first * second);

                if (second < 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }

        // =====================
        // Q12 商品在庫
        // =====================
        scanner.nextLine(); // nextInt対策

        System.out.print("商品名を「、」区切りで入力してください: ");
        String inputProducts = scanner.nextLine();

        String[] products = inputProducts.split("、");

        int tvStock = random.nextInt(12);      // 0〜11
        int displayStock = 11 - tvStock;

        for (String product : products) {

            product = product.trim();

            switch (product) {
                case "テレビ":
                case "ディスプレイ":
                    int stock = product.equals("テレビ")
                            ? tvStock
                            : displayStock;

                    System.out.println(
                            product + "の残り台数は " + stock + "台です"
                    );
                    break;

                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(
                            product + "の残り台数は "
                                    + random.nextInt(12) + "台です"
                    );
                    break;

                default:
                    System.out.println(
                            "『 " + product + " 』は指定の商品ではありません"
                    );
            }
        }

        scanner.close();
    }
}
