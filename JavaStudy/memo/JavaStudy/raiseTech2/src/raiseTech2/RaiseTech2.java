package raiseTech2;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class RaiseTech2 {

    public static void main(String[] args) {
        // コンソールに「HelloWorld」を表示してみよう。
        // 変数greetingをString型で定義して、そこに値を代入してから表示する事。
        String greeting = "HelloWorld";
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

        String youbi = null;

        switch (dayOfWeek) {
            case TUESDAY:
                youbi = "火曜日";
                break;
            case FRIDAY:
                youbi = "金曜日";
                break;
            case MONDAY:
                youbi = "月曜日";
                break;
            case SATURDAY:
                youbi = "土曜日";
                break;
            case SUNDAY:
                youbi = "日曜日";
                break;
            case THURSDAY:
                youbi = "木曜日";
                break;
            case WEDNESDAY:
                youbi = "水曜日";
                break;
            default:
                break;
        }
        System.out.println("３年後の今日の曜日は" + youbi + "です!!");

        // コンソールに「引数が0なら偽。引数が1なら真」と表示してみよう。if文で表現できる。
        int a = 0;
        if (a == 0) {
            System.out.println("引数が0なら偽");
        } else {
            System.out.println("引数が1なら真");
        }

        // コレクション型は割愛。String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
        // Listに入れる内容は何でもOK。ただし複数入れる事
        Map<String, String> map = new LinkedHashMap<String, String>();
//        普通のHashMapだと順番に表示されない。 LinkedHashMapだと順番が保持される
//        ちなみにTreeMapだとkeyの昇順になる
        map.put("校長", "エナミ先生");
        map.put("講師", "朴先生");
        map.put("メンター", "野田先生");
        map.put("生徒", "すみちゃん");

        for (String key : map.keySet()) {
            System.out.println(key + "の" + map.get(key));
        }

        BigDecimal bdNum1 = new BigDecimal("1");// コンストラクタの引数
        BigDecimal bdNum2 = new BigDecimal("0.9");
        BigDecimal bdNum3 = new BigDecimal("0.9");

//        下記からは課題以外です。↓↓↓
        System.out.println(bdNum1.add(bdNum2).add(bdNum3));// addはメソッド メソッド（）
        // メソッドを実行して、その結果に対してさらにメソッドを実行する感じで、
        // メソッドを繋げながら何らかの処理をしていく仕組み
//        no1に、no２を足す、それに、no３を足す。
//        "1"→私は / no→TY / add→oyogu
//        addという

        taiyaki TY = new taiyaki("私は");

        TY.oyogu().oyogu().oyogu();
//        メソッドチェーン メソッドのoyoguをつなげている
//タイ焼きが泳ぐを３回繰り返している
        // まずtaiyakiのインスタンスが呼ばれて「眠い私は」
        // 次にoyogu()が呼ばれて「すいすい泳ぐ」を出力、return this自分自信を返す
        // ２回目は２つ目のoyogu()の処理をするので、これを3回繰り返すことになる
        // 結果、眠い私は すいすい泳ぐ×３なる

    }

}
