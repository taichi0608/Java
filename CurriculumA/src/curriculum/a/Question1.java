package curriculum.a;

public class Question1 {

    public static void main(String[] args) {

        // Q1 各型の変数を宣言し、初期値を設定
        byte byteNum = 0;
        short shortNum = 0;
        int intNum = 0;
        long longNum = 0L;
        float floatNum = 0.0f;
        double doubleNum = 0.0;
        char letter = ' ';
        String letters = "";
        boolean isBoolean = false;

        // Q2 各変数に指定された値を代入
        byteNum = 10;
        shortNum = 100;
        intNum = 1000;
        longNum = 10000;
        floatNum = 9.5f;
        doubleNum = 10.5;
        letter = 'a';
        letters = "ハロー";
        isBoolean = true;

        // Q3 出力
        int result20 = byteNum + shortNum - 90;
        System.out.println(byteNum + shortNum + intNum); // 11110
        System.out.println(result20); // 20
        System.out.println(letter + " " + letters + " " + isBoolean); // a ハロー true
        System.out.println(byteNum + shortNum + intNum + longNum + result20); // 11130
        System.out.println(intNum * longNum); // 10000000000
        System.out.println(doubleNum / 100); // 0.105
        System.out.println(byteNum - shortNum); // -90

        // Q4
        String name = "山田太郎";
        System.out.println("こんにちは、" + name + "さん！");

        // Q5
        int age = 25;
        System.out.println("年齢: " + age + "歳");

        // Q6
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);

        // Q7
        int score = 80;
        score += 20;
        System.out.println("最終スコア: " + score);

        // Q8
        double price = 99.99;
        System.out.println("整数価格: " + (int) price);

        // Q9
        String numStr = "123";
        System.out.println("変換後の値: " + (Integer.parseInt(numStr) + 10));

        // Q10
        int num = 50;
        System.out.println("得点: " + String.valueOf(num) + "点");

        // Q11 条件演算子
        int a = 10;
        int b = 20;
        boolean result = (a < b) ? true : false;
        System.out.println(result);

        // Q12 三項演算子
        int x = 15;
        String check = (x >= 10) ? "OK" : "NG";
        System.out.println(check);

        // Q13 文字列の置き換え
        String text = "私はJavaが好きです。Javaは楽しい！";
        System.out.println(text.replace("Java", "Python"));
    }
}
