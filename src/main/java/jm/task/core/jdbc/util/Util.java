package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String USER_NAME = "user1";
    private static final String URL = "jdbc:mysql://localhost:3306/TestMMy";
    private static final String PASSWORD = "12345";

    private static Connection connection;
    private static Statement statement;


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void close_Conn() throws SQLException {
        connection.close();
    }
}
