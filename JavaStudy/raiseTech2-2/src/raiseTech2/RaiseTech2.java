package raiseTech2;

public class RaiseTech2 {

    public static void main(String[] args) {
        WorkplaceCommunication wc = new WorkplaceCommunication();// インスタンス化 職場コミュが生まれた

        wc.greet();// 職場の挨拶
        wc.greet("Hello");// 職場の挨拶はHellと決まっている
        wc.greet("上司", "おはようございます");// 職場の人によって挨拶を変える上司ver
        wc.greet("部下1", "おはよう～～");// 職場の人によって挨拶を変える部下ver
        wc.greet("部下1", "おはよう～～", 3);// 職場の人によって挨拶を変える部下、職歴ver
        wc.greet("部下2", "おはよ!!!");// 職場の人によって挨拶を変える部下ver
        wc.greet("部下2", "おはよ!!!", 4);// 職場の人によって挨拶を変える部下、職歴ver

        boolean handan = wc instanceof WorkplaceCommunication;// 職場かどうか判断するフィールド handan
//↑職場か判断するフィールドになっていない。handanは職場はコミュクラスが実装されているかの判断になっている
        if (handan) {
            wc.greet();
        } else {
            System.out.println("挨拶しません");
        }
    }

}

interface Communication { // 抽象的なコミュニケーションクラス何をするか決まっていない
    void greet();// 挨拶はしてほしいけどどんなあいさつか決まっていないので場所（職場とか）によって決めてね
}

class WorkplaceCommunication implements Communication { // 職場の場合のコミュ方法を実装
    public void greet() {// 職場の挨拶の仕方はこうだ!

        System.out.println("Hello");// Helloと挨拶してね
    }

    public void greet(String hito, String aisatu) {
        System.out.println(hito + aisatu);

    }

    public void greet(String hito, String aisatu, int syokureki) {
        try { // 例外が発生する処理
            String syokurekihikaku = null;
            int s = syokurekihikaku.length(); // nullの文字数をiに代入
            if (syokureki > s) { // nullの文字数と職歴を比較はできないので
                throw new Exception(); // エラーが発生する
            }
        } catch (Exception e) { // エラーが発生したらどうするか書く
            System.out.println(e);
            System.out.println("※" + hito + "の職歴を比べることはできません");
        }

    }

    public void greet(String aisatu) {
//    greetというメソッド内でHelloという言葉を受けたら、Helloと返す処理
//    helloをwc.greet("Hello")で受け取った時の処理
        System.out.println(aisatu);
    }

}