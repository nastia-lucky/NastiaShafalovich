package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/HomelessPets?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "11111111";

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Connection getConnection() {

        return connection;
    }
}

