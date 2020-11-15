package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example5_1 {

 /* 定数 */
 /** ドライバーのクラス名 */
 private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
 /** ・JDMC接続先情報 */
 private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
 /** ・ユーザー名 */
 private static final String USER = "postgres";
 /** ・パスワード */
 private static final String PASS = "kururu966";

 public static void main(String[] args) {

 Statement statement = null;
 ResultSet resultSet = null;

 try (Connection connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);) {
 Class.forName(POSTGRES_DRIVER);
 

 statement = connection.createStatement();
 String SQL = "SELECT * FROM Goods";
 resultSet = statement.executeQuery(SQL);

 while (resultSet.next()) {
 String column4 = resultSet.getString("Goodscode");
 String column1 = resultSet.getString("GoodsName");
 String column2 = resultSet.getString("UnitPrice");
 String column3 = resultSet.getString("UpdateDate");

 System.out.print(column4 + ",");
 System.out.print(column1 + ",");
 System.out.print(column2 + ",");
 System.out.println(column3);
 }

  // forName()で例外発生
 } catch (ClassNotFoundException e) {
 e.printStackTrace();

  // getConnection()、createStatement()、executeQuery()で例外発生
 } catch (SQLException e) {
 e.printStackTrace();

 }
 }
}