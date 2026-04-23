package ro.digitalstack.betfair.session11.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection(String type) {

        if (type.equalsIgnoreCase("postgresql")) {
            String url = "jdbc:postgresql://localhost:5432/betfair2026";
            final Properties props = new Properties();
            props.setProperty("user", "root");
            props.setProperty("password", "root");
            try {
                Connection connection = DriverManager.getConnection(url, props);
                System.out.println(connection.getMetaData().getDatabaseProductVersion());
                return connection;
            } catch(SQLException e) {
                System.out.println("Error connecting to database " + Arrays.toString(e.getStackTrace()));
            }
        }

        return null;
    }
}
