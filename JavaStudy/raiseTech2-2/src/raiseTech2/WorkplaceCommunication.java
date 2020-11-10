package raiseTech2;

class WorkplaceCommunication implements Communication { // 職場の場合のコミュ方法を実装

    public void greet() {// 職場の挨拶の仕方はこうだ!

        System.out.println("Hello①");// Helloと挨拶してね
    }

    public void greet(String human, String greet) { // 人によって挨拶を変える
        System.out.println(human + "さん" + greet);

    }

    public void greet(String human, int position) {
        try { // 例外が発生する処理
            int m = 100 / position;// ゼロで割ることはできない。=勤続ゼロ年。エラー
            if (m < 0) {
                throw new Exception(); // エラーを発生させる
            } else {
                int j = 50 - position;
                System.out.println(human + "さんは勤続50年まであと" + j + "年あります");
            }
        } catch (Exception e) { // エラーが発生したらどうするか書く
            System.out.println(e);// エラー表示
            System.out.println("※" + human + "さんはまだ働いていません");
        }

    }

    public void greet(String greet) {
//    greetというメソッド内でHelloという言葉を受けたら、Helloと返す処理
//    helloをwc.greet("Hello")で受け取った時の処理
        System.out.println(greet);
    }

    public static boolean isWorkplace(String place) {

        String workplace = "workplace";

        if (workplace.equals(place)) {
            return true;
        } else {
            return false;
        }

    }
}