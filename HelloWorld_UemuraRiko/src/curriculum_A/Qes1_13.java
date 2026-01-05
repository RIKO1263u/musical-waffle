package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		
		// Q1
		
		// 変数byteNumの初期値を設定
		byte byteNum = 0;
		// 変数shortNumの初期値を設定
		short shortNum = 0;
		// 変数intNumの初期値を設定
		int intNum = 0;
		// 変数longNumの初期値を設定
		long longNum = 0L;
		// 変数floatNumの初期値を設定
		float floatNum = 0.0f;
		// 変数doubleNum初期値を設定
		double doubleNum = 0.0;
		// 変数letterの初期値を設定
		char letter = '\u0000';
		// 変数lettersの初期値を設定
		String letters = null;
		// 変数isBooleanの初期値を設定
		boolean isBoolean = false;
		
		
		
		// Q2
		
		// 変数byteNumに10を代入
		byteNum = 10;
		// 変数shortNumに100を代入
		shortNum = 100;
		// 変数intNumに1000を代入
		intNum = 1000;
		// longNum変数に10000を代入
		longNum = 10000L;
		//　変数floatNumに9.5fを代入
		floatNum = 9.5f;
		//　変数doubleNumに10.5を代入
		doubleNum = 10.5;
		// 変数letterに'a'を代入
		letter = 'a';
		// 変数lettersに"ハロー"を代入
		letters = "ハロー";
		// 変数isBooleanにtrueを代入
		isBoolean = true;
		
		
		
		// Q3 	コンソール出力されるようにする
		
		// 11110を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		
		// 20を出力
		
		System.out.println(byteNum + byteNum);
		
		// a ハロー trueを出力
		
		System.out.println(letter + " " + letters + " " + isBoolean);
		
		// 数字を全て足して出力
		
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		
		// 小数点以外の数字を全てかけて出力
		
		System.out.println(byteNum * shortNum * intNum * longNum );
		
		// 10.5割る100をして出力
		
		System.out.println(doubleNum / shortNum);
		
		// 10引く100をして出力
		
		System.out.println(byteNum - shortNum);
		
		
		
		// Q4 
		
		//nameというString型の変数を宣言し、"山田太郎”という値を代入
		
		String name = "山田太郎";
		
		// コンソールに こんにちは、山田太郎さん！と出力
		
		System.out.println("こんにちは、" + name + "さん！");
		
		
		
		// Q5
		
		//ageというint型の変数を宣言し、その変数に25を代入。
		
		int age = 25;
		
		// その変数を使用してコンソールに 年齢:25歳と出力
		
		System.out.println("年齢:" + age + "歳");
		
		
		
		// Q6 
		
		//num1というint型の変数を宣言し、10を代入
		
		int num1 = 10;
		
		// num2というint型の変数を宣言し、5を代入
		
		int num2 = 5;
		
		// num1とnum2を足した結果をsumという変数に代入し、コンソールに出力
		
		int sum = num1 + num2;
		
		System.out.println(sum);
		
		
		
		// Q7 
		
		// scoreというint型の変数を宣言し、80を代入
		
		int score = 80;
		
		// scoreに20を加えて、更新
		
		score += 20;
		
		// 最終スコア:100をscoreを使用してコンソールに出力
		
		System.out.println(score);
		
		
		
		// Q8
		
		// priceというdouble型の変数を宣言し、99.99を代入
		
		double price = 99.99;
		
		// priceをint型に変換
		
		int intPrice = (int) price ; // 強制型変換
		System.out.println("整数価格:" + intPrice);  // 出力：99
		
		
		
		// Q9
		
		// String型の変数 numStrに"123"を代入
		
		String numStr = "123";
		
		// numStrをint型に変換
		
		int num = Integer.parseInt(numStr);
		System.out.println(num + 10);  // 出力：133
		
		
		
		// Q10
		
		// int型の変数numに50を代入
		
		int num3 =50;
		
		// numをString型に変換し、"得点:50"の形で表示
		
		String str = String.valueOf(num3);
		System.out.println("得点:" + str + "点");
		
		
		
		// Q11
		
		// int型の変数aに10を代入
		
		int a = 10;
		
		// int型の変数bに20を代入
		
		int b = 20;
		
		// aがbより小さいかどうかをboolean変数resultに代入
		
		boolean result = a < b;
		
		System.out.println(result);
		
		
		
		
		// Q12
		
		// int型の変数xに15を代入
		
		int x = 15;
		
		// xが10以上なら"OK"、そうでなければ"NG"を表示
		
		System.out.println(x >= 10 ? "OK" : "NG");
		
		
		
		// Q13
		
		String text = "私はJavaが好きです。Javaは楽しい!";
		System.out.println(text.replace("Java", "Python"));
		
	
		
		
		
		
		// Ques10 8で使用した年齢が	25歳以上ならtrueが出力されるようにする
		
		System.out.println(age1 >= 25);
		
		// Ques11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する
		
		
	
	}

}
