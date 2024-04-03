package Lab2Level2Task1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Lab2Level2Task1.Main.CONNECTION_STRING;

public class InfoConnection {

    protected Connection connection;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING);
        } catch (SQLException ex) {
            System.out.println(ex + ex.getMessage());
        }
        return connection;
    }

    public InfoConnection() {
    }

    public InfoConnection(String infoConnection) {
        try {
            connection = DriverManager.getConnection(infoConnection);
            System.out.println("Подключился!");
        } catch (SQLException ex) {
            System.out.println("Нет подключения к базе! " + ex.getMessage());
        }
    }

}
