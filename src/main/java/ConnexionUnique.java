import java.sql.*;

/**
 * Created by g16003568 on 27/09/17.
 */
public class ConnexionUnique {
    private Connection connection;
    private static ConnexionUnique instance;
    private String CONNECT_URL;
    private String LOGIN;
    private String PASSWORD;

    // Chaine de connexion


    public ConnexionUnique() {

        CONNECT_URL = "jdbc:mysql://mysql-gaboriau.alwaysdata.net/gaboriau_tutojdbc";
        LOGIN = "gaboriau_bd";
        PASSWORD = "youpi";
        try {
            connection= DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static ConnexionUnique getInstance() {
        if (instance == null)
            instance = new ConnexionUnique();
        return instance;
    }
}