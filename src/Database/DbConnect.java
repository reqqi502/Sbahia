package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    static Connection dbLink ;

    // Connexion
    public static Connection getConnect() throws ClassNotFoundException, SQLException {

    	Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/Sbahia";
        String dbUser = "postgres";
        String dbPass = "0000";

        // TimeZone : ?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        
        try {
            dbLink = DriverManager.getConnection(url, dbUser, dbPass);
            System.out.println("connection truuuue !!!");
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
            System.out.println("connection failed !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return dbLink;
    }




}