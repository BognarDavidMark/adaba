import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements Database {
    public Connection connectDB() {
        Connection con = null;
        try {
            con = tryconnectDB();
        } catch(SQLException e) {
            System.out.println("Hiba! A kapcsoódás sikertelen!");
        }
        return con;
    }

    public Connection tryconnectDB() throws SQLException {
        Connection con = null;
        String url = "jdb:mariadb://localhost:3306/adaba";
        String user = "adaba";
        String password = "titok";
        con = DriverManager.getConnection(url, user, password);

        return con;
    }

    public void closeDB(Connection con) {
        
    }
}
