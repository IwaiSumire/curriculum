package paiza;

import java.util.Scanner;

public class Paiza {

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        int seiseki = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("一行目に生徒の人数、合格点を入れてください");
        String line = sc.nextLine();
        String[] data = line.split(" ");
        
        int ninzu = Integer.parseInt(data[0]);
        int goukaku = Integer.parseInt(data[1]);
        
        System.out.println("出席番号順にテストの点数と、欠席回数を入力してください");
        System.out.println("欠席１回に対し、５点減点されます");
        System.out.println("合格者の出席番号のみ出力します");
        
        for (int i = 0; i < ninzu; i++) {
            String line2 = sc.nextLine();
            String[] data2 = line2.split(" ");
            int tensu = Integer.parseInt(data2[0]);
            int kesseki = Integer.parseInt(data2[1]);

            if (tensu - kesseki * 5 <= 0) {
                seiseki = 0;
            } else {
                seiseki = tensu - kesseki * 5;
            }

            if (seiseki >= goukaku) {
                System.out.println(i + 1);
            }

        }

    }
}
