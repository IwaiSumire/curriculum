package raiseTech2;

public class RaiseTech2 {

    public static void main(String[] args) {
        WorkplaceCommunication wc = new WorkplaceCommunication();// インスタンス化 職場コミュが生まれた

        wc.greet();// 職場の挨拶
        wc.greet("Hello②");// 職場の挨拶はHellと決まっている
        wc.greet("上司", "おはようございます");// 職場の人によって挨拶を変える上司ver
        wc.greet("部下1", "おはよう～～");// 職場の人によって挨拶を変える部下ver
        wc.greet("部下2", "おはよ!!!");// 職場の人によって挨拶を変える部下ver
        wc.greet("部下1", 3);// 勤続50年までどれくらいか エラーなしver
        wc.greet("部下2", 0);// 勤続50年までどれくらいか エラーありver

        String a = "workplace";

        if (WorkplaceCommunication.isWorkplace(a)) {
            wc.greet();
        } else {
            System.out.println("無視する");
        }

    }

}