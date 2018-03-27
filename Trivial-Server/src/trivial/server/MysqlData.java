package trivial.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlData {
    static String url = "jdbc:mysql://localhost:3306/trivialdb";
    static String username = "root";
    static String password = "";
    static Connection connection;
    
    public static void open() throws SQLException{
        connection = DriverManager.getConnection(url, username, password);
    }
    public static void close() throws SQLException{
        connection.close();
    }
    public static ArrayList<Pregunta> getPregunta(String Categoria) throws SQLException{
        ArrayList<Pregunta> ask = new ArrayList<>();
        String query = "SELECT * FROM `preguntas` WHERE `CATEGORIA` ='" + Categoria + "';";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            
            ask.add(new Pregunta(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
        }
        
        return ask;
    }
}
