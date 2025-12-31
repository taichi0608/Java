package curriculum.b;

public class Question5 {

	public static void main(String[] args) {

		// Q1
		helloWorld();

		System.out.println("----");

		// Q2
		int result = doubleValue(10);
		System.out.println("10 を 2 倍すると " + result + " です。");

		System.out.println("----");

		// Q3
		int num1 = 7;
		int num2 = 10;

		if (isEven(num2)) {
			System.out.println(num2 + " は偶数です。");
		} else {
			System.out.println(num2 + " は奇数です。");
		}

		if (isEven(num1)) {
			System.out.println(num1 + " は偶数です。");
		} else {
			System.out.println(num1 + " は奇数です。");
		}
	}

	// Q1 引数なし・戻り値なし
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	// Q2 引数あり・戻り値あり
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3 偶数判定
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
