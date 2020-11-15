import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        // 問① select.htmlから渡された値を受け取るために下記を修正しましょう。
        
        //ここにhtmlから受け取った月をvalueに引き渡す
        String value = request.getParameter("month");
        //htmlで結果を表示し、文字種類の指定をする
        response.setContentType("text/html; charset=UTF-8");
        //レスポンス結果を出す指示
        PrintWriter out = response.getWriter();
        // 問② エビデンスと同じ表示になるように修正しましょう。

        out.print("<p>今は" + value + "月です。</p>");

    }
}
