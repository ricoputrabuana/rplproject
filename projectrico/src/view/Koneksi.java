package view;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    public static Connection getConnection() {
        Connection connection = null;
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/kantor";
        String user="root";
        String password="";
        if(connection == null){
            try{
                Class.forName(driver);
                connection = (Connection) DriverManager.getConnection(url, user, password);
            }catch(ClassNotFoundException | SQLException error){
                System.exit(0);
            }
        }
        return connection;
    }
}
