package exception;

public class Exception {

    public static void main(String[] args) {

        int a = 0;
        int b = 5;
        int c = 2;

        try {

            System.out.println(b / a);
            System.out.println(b / c);
        } catch (ArithmeticException e) {
            System.out.println(e + "例外です");

        } finally {
            System.out.println("必ず実行されるyo");
        }

    }

}
