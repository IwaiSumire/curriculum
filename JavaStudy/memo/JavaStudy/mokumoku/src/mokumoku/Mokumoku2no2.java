package mokumoku;

import java.util.Scanner;

public class Mokumoku2no2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("入力した西暦が閏年か調べます");
        int y = sc.nextInt();

        if (y % 4 == 0 && y % 400 == 0) {
            System.out.println("Yes");
        } else if (y % 100 == 0) {
            System.out.println("No");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
