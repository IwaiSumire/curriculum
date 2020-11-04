package mokumoku;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mokumoku1 {

    public static void main(String[] args ) {

        String year = null;
        String month = null;
        String day = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; 4 > i; i++) {

            String line = sc.nextLine();

            if (i == 1) {
                year = line;
            } else if (i == 2) {
                month = line;
            } else if (i == 3) {
                day = line;
            }

        }
        try {
            // 20201031をtimeに作成
            String time = month + "/" + day + "/" + year;
            // 月/日/年になるようにフォーマットを指定
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            // 20201031をDate型に変更する
            Date formatDate = sdf.parse(time);
            // Date型に変更され、書式を指定したものを出力する
            System.out.println(sdf.format(formatDate));
        } catch (ParseException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

    }
}