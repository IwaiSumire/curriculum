package mokumoku;

import java.util.ArrayList;
import java.util.Scanner;

public class Mokumoku2no1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("何人文入力しますか？");
        int n = sc.nextInt();
        // 例:2名分いれます

        ArrayList<Integer> a = new ArrayList<Integer>();

        // a配列の箱がn（例:2）個作られた

        System.out.println(n + "人分の持っているお金を順番に入力してください");
        for (int i = 0; i < n; i++) {

            a.add(sc.nextInt());
            // 例:2人分のお金を入力します
        }

        System.out.println(n + "人の持っているお金の確認" + (a));
        // aの配列ができていいるか確認→OK

        System.out.println("入力した金額を所持している人が何番目に入力されたか表示できます");
        System.out.println("なお、同じ金額を所持している場合は早く入力した方が表示されます");
        int k = sc.nextInt();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == k) {
                System.out.println(i + 1);
                break;
            }
        }

        if (a.contains(k)) {
            System.out.println("あります");
        } else {
            System.out.println("ありません");
        }

        sc.close();

    }

}
