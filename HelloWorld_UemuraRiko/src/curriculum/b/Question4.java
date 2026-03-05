package curriculum.b;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		// Q1 int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する配列の全要素を順番に表示
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// Q2 int 型の配列 {10, 20, 30, 40, 50} を用意する 配列の要素を 逆順 に表示
		int[] number = { 10, 20, 30, 40, 50 };
		for (int i = number.length - 1; i >= 0; i--) {
			System.out.println(number[i]);
		}

		// Q3 int 型の配列 {3, 5, 7, 9, 11} を用意する 配列の全要素の合計値を計算し、表示
		int[] nums = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);

		// Q4  int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		int[] numbers1 = { 12, 7, 9, 21, 5, 18 };
		// 配列の 最大値と最小値 を求めて表示
		int max = numbers1[0]; //　最初の値を最大値とする
		int min = numbers1[0]; // 最初の値を最小値とする

		for (int i = 1; i < numbers1.length; i++) {
			if (numbers1[i] > max) {
				max = numbers1[i];
			}
			if (numbers1[i] < min) {
				min = numbers1[i];

			}
		}

		System.out.println(max);
		System.out.println(min);

		// Q5  int 型の配列 {1, 2, 3, 4, 5} を用意する
		int[] numbers2 = { 1, 2, 3, 4, 5 };
		// 配列のすべての要素を2倍にし、結果を表示
		for (int number2 : numbers2) {
			System.out.println(number2 * 2);
		}

		// Q6  int 型の配列 {4, 7, 10, 15, 20} を用意する
		// ユーザーがコンソール入力した数が 配列に含まれているかを判定し、結果を表示

		// int型の配列を用意
		int[] nums1 = { 4, 7, 10, 15, 20 };

		// コンソール入力の準備
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = sc.nextInt();
		sc.close();

		// 含まれているか判定するための変数
		boolean found = false;

		// 配列を調べる
		for (int n : nums1) {
			if (n == input) {
				found = true;
				break; //見つかったら終了
			}
		}

		// 結果表示
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は配列に含まれていません");
		}

		// Q7 2次元配列　int[][] array ＝　{{1,2},{3,4},{5,6}};を用意する
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}

		// Q8 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		int[][] array1 = { { 10, 20, 30 }, { 40, 50, 60, }, { 70, 80, 90 } };
		int sum1 = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				sum1 += array1[i][j];
			}
		}
		System.out.println(sum1);

		// Q9 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		int[][] array2 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		int max1 = array2[0][0];
		int min1 = array2[0][0];

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				if (array2[i][j] > max1) {
					max1 = array2[i][j];
				}
				if (array2[i][j] < min1) {
					min1 = array2[i][j];
				}

			}
		}
		System.out.println("最大値：" + max1);
		System.out.println("最小値:" + min1);

		// Q10 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		int[][][] array3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				for (int k = 0; k < array3.length; k++) {
					System.out.println(array3[i][j][k]);
				}
			}
		}

	}
}
