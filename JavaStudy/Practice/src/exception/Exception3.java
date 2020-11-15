package exception;

import java.util.Scanner;

public class Exception3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1～10までを入力してください");

        int n = sc.nextInt();

        sc.close();

        try {

            if (n > 10) {
                throw new IllegalArgumentException();
            }

            System.out.println("例外ではありませんでした");

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("入力の値が10以上で正しくありません");
        }

    }
}
