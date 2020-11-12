package exception;

import java.util.Iterator;

import com.sun.javadoc.ThrowsTag;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class Exception2 {

    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 5; i++) {
                int a = getNum(i);
                int b = 5;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        
        public static int getNum(int index) Throws ArithmeticException {
            
        }
    }

}
