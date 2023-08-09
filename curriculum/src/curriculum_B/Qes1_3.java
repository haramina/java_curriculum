package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 問１
        while (true) {
            // ユーザー名の入力を受け付ける
            System.out.print("ユーザー名を入力してください: ");
            String username = scanner.nextLine();

            // ユーザー名が null もしくは空文字の場合
            if (username == null || username.trim().isEmpty()) {
                System.out.println("名前を入力してください");
            }
            // ユーザー名が 10 文字より大きい場合
            else if (username.length() > 10) {
                System.out.println("名前を10文字以内にしてください");
            }
            
            // 問2ユーザー名に半角英数字以外の文字が含まれる場合
            
            else if (!username.matches("^[a-zA-Z0-9]*$")) {
                    System.out.println("半角英数字のみで名前を入力してください");
                    break;
            }
            
            // ユーザー名が正常な値の場合
            else {
                System.out.println("ユーザー名「" + username + "」を登録しました");
            }
        }

        scanner.close();
    }
}