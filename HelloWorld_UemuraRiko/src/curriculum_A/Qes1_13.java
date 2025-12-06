package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		// Ques1
		
		// バイト型変数の宣言
		byte byt;
		// 短整数型変数の宣言
		short s;
		// 整数型変数の宣言
		int i;
		// 長整数変数の宣言
		long l;
		// 単精度浮動小数型変数の宣言
		float f;
		// 倍精度浮動小数型変数の宣言
		double w;
		// 文字型変数の宣言
		char chr;
		// 文字列型変数の宣言
		String str;
		// ブーリアン型変数の宣言
		boolean b;
		
		// Ques2
		
		// バイト型変数に初期値を代入
		byt = 0;
		// 短整数型変数に初期値を代入
		s = 0;
		// 整数型変数に初期値を代入
		i = 0;
		// 長整数型変数に初期値を代入
		l = 0L;
		//　単整度浮動小数型変数に初期値を代入
		f = 0.0f;
		//　倍精度浮動小数型変数に初期値を代入
		w = 0.0d;
		// 文字型変数に初期値を代入
		chr = '\u0000';
		// 文字列型変数に初期値を代入
		str = null;
		// ブーリアン型変数に初期値を代入
		b = false;
		
		// Ques3
		
		// バイト型変数に値を代入
		byt = 10;
		// 短整数型変数に値を代入
		s = 100;
		// 整数型変数に値を代入
		i = 1000;
		// 長整数型変数に値を代入
		l = 10000L;
		// 単精度浮動小数型変数に値を代入
		f = 9.5f;
		// 倍精度浮動小数型変数に値を代入
		w = 10.5d;
		// 文字型変数に値を代入
		chr = 'a';
		// 文字列型変数に値を代入
		str = "ハロー";
		// ブーリアン型変数に値を代入
		b = true;
		
		// Ques4 	コンソール出力されるようにする
		
		System.out.println(byt + s + i + l);
		
		System.out.println(byt + byt);
		
		System.out.println(chr + " " + str + " " + b);
		
		System.out.println(byt + s + i + l + f + w);
		
		System.out.println(byt * s * i * l );
		
		System.out.println(w / s);
		
		System.out.println(byt - s);
		
		// Ques5　正しく動作されるように修正する
		
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		// Ques6　『山田太郎 18歳 170.5cm 62.2kg 寿司』の情報を変数にし、formatの通りに出力する
		
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "です");
		System.out.println("体重は" + weight + "です");
		System.out.println("好きな食べ物は" + food + "です");
		
		// Ques7 6で作成した自己紹介に続いてBMIが表示されるようにする
		
		System.out.println("BMIは" + weight / ((height / 100) * (height / 100)) + "です");
		
		// Ques8 6で宣言した変数に再代入し下記の通りコンソールに出力する
		
		String name1 = "鈴木一郎";
		int age1 = 24;
		double height1 = 168.5;
		double weight1 = 64.2;
		String food1 = "オムライス";
		double BMI = 22.6;
		
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + age1 + "です");
		System.out.println("身長は" + height1 + "です");
		System.out.println("体重は" + weight1 + "です");
		System.out.println("好きな食べ物は" + food1 + "です");
		System.out.println("BMIは" + BMI + "です");
		
		// Ques9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力する
		
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + (age1 + 24) + "です");
		System.out.println("身長は" + (height1 + 168.5) + "です");
		System.out.println("体重は" + (weight1 + 64.2) + "です");
		System.out.println("好きな食べ物は" + food1 + "です");
		System.out.println("BMIは" + weight1 / (height1 / 100) * (height1 / 100) + "です");
		
		
		// Ques10 8で使用した年齢が	25歳以上ならtrueが出力されるようにする
		
		System.out.println(age1 >= 25);
		
		// Ques11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する
	
	}

}
