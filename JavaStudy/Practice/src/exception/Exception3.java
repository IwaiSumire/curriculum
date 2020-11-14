package exception;

import java.util.Scanner;

public class Exception3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        String k = null;

        try {

            if (n > k.length()) {
                throw new NullPointerException();
            }

            System.out.println("例外ではありませんでした");

        } catch (NullPointerException e) {
            System.out.println("例外でした");
            System.out.println(e);
        }

    }
}
