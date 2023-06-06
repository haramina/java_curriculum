package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//1.下記9個をローカル変数として宣言のみしてください
		//・バイト型
		byte byNum;
		//・短整数型
		short shNum;
		//・整数型
		int inNum;
		//・長整数型
		long loNum;
		//・単精度浮動小数点数型
		float flNum;
		//・倍精度浮動小数点数型
		double doNum;
		//・文字型
		char myChar;
		//・文字列型
		String name;
		//・ブーリアン型
		boolean boolA;
		
		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		//・バイト型の初期値を設定
		byNum = 0;
		//・短整数型の初期値を設定
		shNum = 0;
		//・整数型の初期値を設定
		inNum = 0;
		//・長整数型の初期値を設定
		loNum = 0L;
		//・単精度浮動小数点数型の初期値を設定
		flNum = 0.0F;
		//・倍精度浮動小数点数型の初期値を設定
		doNum = 0.0;
		//・文字型の初期値を設定
		myChar = '\u0000';
		//・文字列型の初期値を設定
		name =  null;
		//・ブーリアン型の初期値を設定
		boolA = false;
		
		//3.初期化をしたそれぞれの変数に下記の値を代入してください
		//・バイト型 10
		byNum = 10;
		//・短整数型 100
		shNum = 100;
		//・整数型 1000
		inNum = 1000;
		//・長整数型 10000
		loNum = 10000;
		//・単精度浮動小数点数型 9.5
		flNum = 9.5F;
		//・倍精度浮動小数点数型 10.5
		doNum = 10.5;
		//・文字型 a
		myChar = 'a';
		//・文字列型　ハロー
		name =  "ハロー";
		//・ブーリアン型 true
		boolA = true;
		
		//4.下記の通りにコンソール出力されるようにしてください
		//11110
		System.out.println(byNum + shNum + inNum + loNum);
		//20
		System.out.println(byNum + byNum);
		//a ハロー true
		System.out.println(myChar + name + boolA);
		//11130 数字を全て足す
		System.out.println(byNum + shNum + inNum + loNum + flNum + doNum);
		//10000000000  小数点以外の数字を全てかける
		System.out.println(byNum * shNum * inNum * loNum);
		//0.105 10.5割る100をする
		System.out.println(doNum / shNum);
		//-90 10引く100をする
		System.out.println(shNum - byNum);
		System.out.println();
		
		/*5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		　String num="20";
		　int num1=23;
		　System.out.println("ハローJAVA"+(num+num1));*/
		
		int num=20;//整数型に修正
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		System.out.println();
		
		/*6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』*/
		
		//「初めまして○○です」
		String name6="山田太郎";//代入 
		System.out.println("初めまして" + name6 + "です");//出力
		
		//「年齢は○○歳です」
		int age6 = 18;//代入 
		System.out.println("年齢は" + age6 + "歳です");//出力
		
		//「身長は○○cmです」
		double height6 = 170.5;//代入 
		System.out.println("身長は" + height6 + "cmです");//出力
	
		//「体重は○○kgです」
		double weight6 = 62.2;//代入 
		System.out.println("体重は" + weight6 + "kgです");//出力
		
		//「好きな食べ物は○○です」
		String lovefood6 = "寿司";//代入 
		System.out.println("好きな食べ物は" + lovefood6 + "です");//出力
		System.out.println();
		
		/*7.6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 * ただし計算は数値を直書きせず、全て変数を使ってすること
		 * 「BMIは○○です」 */
		double bmi = weight6 / ((height6 / 100) * (height6 / 100));//BMI計算式 体重(kg) / (身長(m) * 身長(m))
		double roundedBMI = Math.round(bmi * 10.0) / 10.0; // 小数点第一位までに丸める
		System.out.println("BMIは" + roundedBMI + "です");//出力
		
		//8.6で宣言した変数に再代入し下記の通りコンソールに出力してください
		//　初めまして鈴木一郎です
		name6="鈴木一郎";//代入 
		System.out.println("初めまして" + name6 + "です");//出力
		
		//　年齢は24歳です
		age6 = 24;//代入 
		System.out.println("年齢は" + age6 + "歳です");//出力
		
		//身長168.5cmです
		height6 = 168.5;//代入 
		System.out.println("身長は" + height6 + "cmです");//出力
		
		//体重は64.2kgです
		weight6 = 64.2;//代入 
		System.out.println("体重は" + weight6 + "kgです");//出力
		
		//好きな食べ物はオムライスです
		lovefood6 = "オムライス";//代入 
		System.out.println("好きな食べ物は" + lovefood6 + "です");//出力
		
		//BMIは22.6です
		double bmi2 = weight6 / ((height6 / 100) * (height6 / 100));//BMI計算式 体重(kg) / (身長(m) * 身長(m))
		double roundedBMI2 = Math.round(bmi2 * 10.0) / 10.0; // 小数点第一位までに丸める
		System.out.println("BMIは" + roundedBMI2 + "です");//出力
		System.out.println();
		
		//9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		//　初めまして鈴木一郎です
		name6="鈴木一郎";//代入
		System.out.println("初めまして" + name6 + "です");//出力
		
		//　年齢は48歳です
		age6 += age6;//自己代入                                                              ;
		System.out.println("年齢は" + age6 + "歳です");//出力
		
		//　身長337.0cmです
		height6 += height6;//自己代入
		System.out.println("身長は" + height6 + "cmです");//出力
		
		//　体重は128.4kgです
		weight6 += weight6;//自己代入
		System.out.println("体重は" + weight6 + "kgです");//出力
		
		//　好きな食べ物はオムライスです
		lovefood6 = "オムライス";//代入
		System.out.println("好きな食べ物は" + lovefood6 + "です");//出力
		
		//　BMIは11.31です
		double bmi3 = weight6 / ((height6 / 100) * (height6 / 100));//BMI計算式 体重(kg) / (身長(m) * 身長(m))
		double roundedBMI3 = Math.round(bmi3 * 100.0) / 100.0; // 小数点第二位までに丸める
		System.out.println("BMIは" + roundedBMI3 + "です");//出力
		
		System.out.println();
		
		//10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		// 問8の値を再代入
		name6 = "鈴木一郎";
		age6 = 24;
		height6 = 168.5;
		weight6 = 64.2;
		lovefood6 = "オムライス";
		
		boolean over25 = (age6 >= 25);// 条件式
		System.out.println(over25);//出力

		System.out.println();
		
		//11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		String date1 = Integer.toString(age6);//年齢
		String date2 = Double.toString(height6);//身長
		String date3= Double.toString(weight6);//体重
		System.out.println(date1 + date2 + date3);//繋げる処理
		
		System.out.println();
		
		//12.11で変換した【年齢・身長】を整数型に変換して出力してください
		int iAge = Integer.parseInt(date1); // 年齢
		System.out.println(iAge); // 出力

		int iHeight = (int) Double.parseDouble(date2); // 身長
		System.out.println(iHeight); // 出力
		
		System.out.println();
		
		//13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		boolean over; // boolean型の変数を宣言
		over = (iAge >= 25 || iHeight >= 160); // 条件式
		System.out.println(over);//出力
		
		System.out.println();
	}

}
