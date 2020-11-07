package raiseTech2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;

public class RaiseTech2 {

    public static void main(String[] args) {
        // コンソールに「HelloWorld」を表示してみよう。
        // 変数greetingをString型で定義して、そこに値を代入してから表示する事。
        String greeting = "HelloWorid";
        System.out.println(greeting);

        // コンソールに1～10まで足した結果を表示してみよう。
        // ただし、for文を使って4行程度に収める事。出来る人は更に短くしてみましょう！
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // コンソールに「3年後の今日が何曜日なのか」を計算して表示してみよう。
        // 使うのはLocalDateTimeとDayOfWeekは必ず使う。
        LocalDateTime year = LocalDateTime.now();
        year = year.plusYears(3);
        DayOfWeek dayOfWeek = year.getDayOfWeek();
        System.out.println("３年後の今日の曜日は" + dayOfWeek + "です");

        //コンソールに「引数が0なら偽。引数が1なら真」と表示してみよう。if文で表現できる。
        int a =0;
        if(a==0) {
            System.out.println("引数が0なら偽");
        } else {
            System.out.println("引数が1なら真");
        }

        //コレクション型は割愛。String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
        //Listに入れる内容は何でもOK。ただし複数入れる事
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("校長", "エナミ先生");
        map.put("講師", "朴先生");
        map.put("メンター", "野田先生");
        map.put("生徒", "すみちゃん");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

}
