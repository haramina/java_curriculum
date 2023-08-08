package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
    	System.out.println("Q1");
    	// ・コンソールにユーザー名を入力できるようにしてください
        System.out.println("ログイン");
        System.out.println("ユーザー名を入力してください:");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        // ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
        if (username == null || username.length() <= 0) {
            System.out.println("名前を入力してください");
        } else if (username.length() > 10) {
        // ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
            System.out.println("名前を10文字以内にしてください");
        } else {
        // ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
            System.out.println(("ユーザー名「" + username + "」を登録しました") + "\n");
        }
        
        System.out.println("Q2");
        // ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
        if (username == null || username.length() <= 0) {
            System.out.println("名前を入力してください");
        } else if (username.length() > 10) {
        // ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
            System.out.println("名前を10文字以内にしてください");
        } else if (!username.matches("[a-zA-Z0-9]+")) {
        // ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
        // ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }
    }
}




