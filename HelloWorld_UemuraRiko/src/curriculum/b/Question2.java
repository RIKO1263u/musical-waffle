package curriculum.b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Q1 int型の変数scoreに75を代入
		int score = 75;

		// scoreが60以上なら"合格です！"と表示

		if (score >= 60) {
			System.out.println("合格です！");

		}

		// Q2 int型の変数ageに25を代入
		int age = 31;

		// ageが20以上30以下なら”適正年齢です”と表示

		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		// Q3 int型に変数ageに18を代入
		age = 18;

			// ageが20以上なら”成人です”と表示

		if (age >= 20) {
			System.out.println("成人です");

			// ageが13以上19以下なら”ティーンエイジャーです”と表示		
		} else if (age >= 13 && age <= 19) {
			System.out.println("ティーンエイジャーです");

			// ageが12以下なら”子供です”と表示
		} else if (age <= 12) {
			System.out.println("子供です");
		}

		// Q4 int 型の変数 x, y, z に 30, 15, 50 を代入。　一番大きい数値を判定して表示
		int x = 30;
		int y = 15;
		int z = 50;

			// 最大値が入る変数
		int max = x;

		if (max < y) {
			max = y;
		}
		if (max < z) {
			max = z;
		}
		System.out.println(max);

		Scanner scanner = new Scanner(System.in);
		
		// 橋岡さんエラーハンドリング教習
		// Scannerに文字が入ってきた場合はメッセージを表示して処理を終了。
		int num = 0;
		try {
			// int 型の変数 num を用意　コンソール入力でいずれかの値を代入。
			num = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("数字を入力してください");
			return;
		}
		
		// Q5  num の値が 0 より大きければ "正の数です" と表示
		if (num > 0) {
			System.out.println("正の数です");
		}
		// num の値が 0 なら "0 です" と表示
		if (num == 0) {
			System.out.println("0です");
		}
		// num の値が 0 より小さければ "負の数です" と表示
		if (num < 0) {
			System.out.println("負の数です");
		}

		// Q6 int型のvalueを用意、コンソール入力でいずれかの値を代入
		int value = scanner.nextInt();
		// valueが偶数なら”偶数です”と表示
		if (value % 2 == 0) {
			System.out.println("偶数です");
		}
		// valueが奇数なら”奇数です”と表示
		if (value % 2 != 0) {
			System.out.println("奇数です");
		}

		// Q7 int型の変数scoreにコンソール入力で0から100のいずれかの数値を代入
		score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("0から100を入力してください");
			return;
		}

		// 90以上なら”優”
		if (score >= 90) {
			System.out.println("優");

		}
		// 70以上なら“良”
		else if (score >= 70) {
			System.out.println("良");

		}

		// 50以上なら‟可”
		else if (score >= 50) {
			System.out.println("可");

			// 50未満なら"不可”	
		} else {
			System.out.println("不可");

		}

		// Q8 コンソール入力がnullまたは空文字("")	のときに「入力が無効です」と表示する処理
		scanner.nextLine();
		String str = scanner.nextLine();
		if(str == null || str =="") {
			System.out.println("入力が無効です");
		}
		
		// Q9 int型の変数dayを用意（コンソール入力で1～7のいずれかの数値を代入)dayの値に応じて曜日を表示
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
		
		// Q10 int型の変数monthを用意(コンソール入力で1～12のいずれかの数値を入力）monthの値に応じて季節を表示
		int month = scanner.nextInt();
		
		switch (month) {
		case 12,1,2:
			System.out.println("冬");
			break;
		case 3,4,5:
			System.out.println("春");
			break;
		case 6,7,8:
			System.out.println("夏");
			break;
		case 9,10,11:
			System.out.println("秋");
			break;
		default:	
			System.out.println("無効な月です");
				}
	}


}
