package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		// Q1 int 型の配列を作成し、1,2,3,4,5 を格納して順番に表示
		int[] array1 = {1, 2, 3, 4, 5};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		System.out.println("----");

		// Q2 配列を逆順に表示
		int[] array2 = {10, 20, 30, 40, 50};
		for (int i = array2.length - 1; i >= 0; i--) {
			System.out.println(array2[i]);
		}

		System.out.println("----");

		// Q3 配列の合計値を計算して表示
		int[] array3 = {3, 5, 7, 9, 11};
		int sum = 0;
		for (int i = 0; i < array3.length; i++) {
			sum += array3[i];
		}
		System.out.println("合計値：" + sum);

		System.out.println("----");

		// Q4 配列の最大値と最小値
		int[] array4 = {12, 7, 9, 21, 5, 18};
		int max = array4[0];
		int min = array4[0];

		for (int i = 1; i < array4.length; i++) {
			if (array4[i] > max) {
				max = array4[i];
			}
			if (array4[i] < min) {
				min = array4[i];
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);

		System.out.println("----");

		// Q5 配列の要素を2倍して拡張for文で表示
		int[] array5 = {1, 2, 3, 4, 5};
		for (int value : array5) {
			System.out.println(value * 2);
		}

		System.out.println("----");

		// Q6 入力した数が配列に含まれているか判定
		int[] array6 = {4, 7, 10, 15, 20};
		Scanner scanner = new Scanner(System.in);
		System.out.print("数値を入力してください：");
		int input = scanner.nextInt();

		boolean found = false;
		for (int i = 0; i < array6.length; i++) {
			if (array6[i] == input) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(input + " は配列に含まれています");
		} else {
			System.out.println(input + " は配列に含まれていません");
		}

		System.out.println("----");

		// Q7 2次元配列の全要素を表示
		int[][] array7 = {{1, 2}, {3, 4}, {5, 6}};
		for (int i = 0; i < array7.length; i++) {
			for (int j = 0; j < array7[i].length; j++) {
				System.out.println(array7[i][j]);
			}
		}

		System.out.println("----");

		// Q8 2次元配列の合計値
		int[][] array8 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int sum2 = 0;
		for (int i = 0; i < array8.length; i++) {
			for (int j = 0; j < array8[i].length; j++) {
				sum2 += array8[i][j];
			}
		}
		System.out.println("合計値：" + sum2);

		System.out.println("----");

		// Q9 2次元配列の最大値と最小値
		int[][] array9 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		int max2 = array9[0][0];
		int min2 = array9[0][0];

		for (int i = 0; i < array9.length; i++) {
			for (int j = 0; j < array9[i].length; j++) {
				if (array9[i][j] > max2) {
					max2 = array9[i][j];
				}
				if (array9[i][j] < min2) {
					min2 = array9[i][j];
				}
			}
		}
		System.out.println("最大値：" + max2);
		System.out.println("最小値：" + min2);

		System.out.println("----");

		// Q10 3次元配列の全要素を表示
		int[][][] array10 = {
			{{1, 2}, {3, 4}},
			{{5, 6}, {7, 8}}
		};

		for (int i = 0; i < array10.length; i++) {
			for (int j = 0; j < array10[i].length; j++) {
				for (int k = 0; k < array10[i][j].length; k++) {
					System.out.println(array10[i][j][k]);
				}
			}
		}

		scanner.close();
	}
}
