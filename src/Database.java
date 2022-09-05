import java.sql.Connection;

public interface Database {
    public Connection connectDB();
    public void closeDB(Connection con);
}
