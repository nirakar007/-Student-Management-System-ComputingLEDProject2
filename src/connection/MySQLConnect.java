package connection;

/**
 *
 * @author neera
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MySQLConnect {

    Connection conn;

    public Connection getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcprac", "root", "iphone53g@");
            System.out.println("Database Connection Successful");
        } catch (Exception e) {
            System.out.println("\"Error in MySQLConnect getConn method: \""+e);
        }

        return conn;
    }
//    public static void main(String[] args) {
//        MySQLConnect connect = new MySQLConnect();
//        connect.getConn();
//    }

}
