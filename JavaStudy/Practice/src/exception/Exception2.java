package exception;

public class Exception2 {

    public static void main(String[] args) {
        
        int[] arry1 = {1,2,3};
        System.out.println(arry1);
        
        try {
//            try内でエラーが起きるかもしれない処理を書く
//            けどtryには書かなくて、エラーが起きそうな処理をメソッド化する
            for (int i = 0; i <= 5; i++) { // ０～５回繰り返す
//                配列のO～5までの数字をgetNumメソッドに渡す
                int a = getNum(i);
                int b = 5;
                System.out.print(a + " / " + b + " = ");
//                0～５までの数字と、５をcalcメソッドに渡す
                System.out.println(calc(a, b));
            }
        } catch (ArithmeticException e) {
//            calcメソッドにて0で割る処理をしてしまった場合、この処理をする
            System.out.println();
            System.out.println("0による割り算発生");
        } catch (ArrayIndexOutOfBoundsException e) {
//            getNamメソッドにて配列外（num[5]）をアクセスした場合、この処理をする
            System.out.println("配列の範囲外にアクセスしました");
        } finally {
//            必ず処理される
            System.out.println("終了");
        }
    }

//    a / bはエラーが起きそうな処理であるので、メソッドとして切り離す
    private static int calc(int a, int b) throws ArithmeticException {
        return a / b;
    }

//    配列の範囲外を計算するエラーが起きそうであるので、メソッドとして切り離す
    public static int getNum(int index) throws ArrayIndexOutOfBoundsException {
        int[] num = { 1, 2, 3, 4 };
        return num[index];
    }
}
