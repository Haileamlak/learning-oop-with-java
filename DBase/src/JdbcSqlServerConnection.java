import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSqlServerConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://DESKTOP-IJRRINU\\SQLEXPRESS06;"
                + "database=AdventureWorks;"
                + "user=yourusername@yourserver;"
                + "password=yourpassword;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}