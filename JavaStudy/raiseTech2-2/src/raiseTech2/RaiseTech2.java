package raiseTech2;

public class RaiseTech2 {

    public static void main(String[] args) {
        WorkplaceCommunication wc = new WorkplaceCommunication();// インスタンス化 職場コミュが生まれた

        wc.greet();// 職場の挨拶
        wc.greet("Hello②");// 職場の挨拶はHellと決まっている
        wc.greet("社長のエナミ", "おはようございます");// 職場の人によって挨拶を変える上司ver
        wc.greet("講師の朴", "おはよう～～");// 職場の人によって挨拶を変える部下ver
        wc.greet("メンターの", "おはよ!!!");// 職場の人によって挨拶を変える部下ver
        wc.greet("トベ", 3);// 勤続50年までどれくらいか エラーなしver
        wc.greet("松田", 0);// 勤続50年までどれくらいか エラーありver

        String place = "workplace";

        if (WorkplaceCommunication.isWorkplace(place)) {
            wc.greet();
        } else {
            System.out.println("無視する");
        }

    }

}