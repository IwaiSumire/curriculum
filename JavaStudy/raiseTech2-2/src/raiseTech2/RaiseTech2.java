package raiseTech2;

import java.util.Scanner;

public class RaiseTech2 {

    public static void main(String[] args) {
        WorkplaceCommunication wc = new WorkplaceCommunication();// インスタンス化 職場コミュが生まれた

        wc.greet();// 職場の挨拶
        wc.greet("Hello②");// 職場の挨拶はHellと決まっている
        wc.greet("社長のエナミ", "おはようございます");// 職場の人によって挨拶を変える上司ver
        wc.greet("講師の朴", "안녕하세요");// 職場の人によって挨拶を変える部下ver
        wc.greet("メンターの野田", "おはようございます～！");// 職場の人によって挨拶を変える部下ver
        wc.greet("トベ", 3);// 勤続50年までどれくらいか エラーなしver
        wc.greet("松田", 0);// 勤続50年までどれくらいか エラーありver


        Scanner sc = new Scanner(System.in);

        System.out.println("所属場所を入力してください（例：職場）");

        String place2 = sc.nextLine();

//        職場ならば、挨拶する
        if (WorkplaceCommunication.isWorkplace(place2)) {
//            falseならば挨拶する
            System.out.println("挨拶は");
            wc.greet();
        } else {
            System.out.println("挨拶しません。無視する");
        }

    }

}