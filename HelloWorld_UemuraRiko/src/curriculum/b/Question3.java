package curriculum.b;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		// Q1 for 文を使って 1 から 10 までの数字を 1 つずつ表示
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// Q2 for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Q3 for 文を使って 10 から 1 まで カウントダウンして表示
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// Q4 for 文を使って 1 から 100 までの合計 を表示
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// Q5 for 文を使って 以下のような三角形を出力
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Q6 while 文を使って 1 から 10 まで を 1 つずつ表示
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// Q7 while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		i = 2;
		while (i <= 20) {
			System.out.println(i);
			i += 2;
		}

		// Q8 while 文を使って 10 から 1 まで のカウントダウンを表示
		i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		// Q9 while 文を使って 1 から 100 までの合計 を表示
		i = 1;
		sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		// Q10 ユーザーから 数値をコンソール入力 してもらう
		// 入力が 0 になるまで 何度でも入力を受け付ける
		// 0が入力されたら「終了しました」と表示
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (!sc.hasNextInt()) {
				System.out.println("半角数字を入力してください");
				sc.next(); //不正入力の切り捨て
				continue;
			}

			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("終了しました");
				break;
			}

		}
		//
		for ( i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				System.out.print(String.format("%02d" ,i) + " * " + String.format("%02d" ,j) + " = " + String.format("%02d" ,i * j) + " || ");
				}
			System.out.println();
		}
	}

}
