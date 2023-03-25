import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String protocol = "jdbc:derby:";

    public static void main(String[] args) {
        try {
            Class.forName(driver).newInstance();
            System.out.println("Loaded the embedded driver.");
        } catch (Exception err) {
            System.err.println("Unable to load the embedded driver.");
            err.printStackTrace(System.err);
            System.exit(0);
        }
        String dbName = "BookDatabase";
        Connection conn = null;
        try {//DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RC9JA8F\\SQLEXPRESS; Databasename = student;encrypt=true;" +
                    "trustServerCertificate=true;IntegratedSecurity=true;");
            System.out.println(
                    "Connecting to and creating the database...");
            // conn = DriverManager.getConnection(protocol + dbName +
            //         ";create=true");
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RC9JA8F\\SQLEXPRESS; Databasename = student;encrypt=true;" +
                    "trustServerCertificate=true;IntegratedSecurity=true;");
            System.out.println("Database created.");
            Statement s = conn.createStatement();
            s.execute("CREATE TABLE names" +
                    "(author varchar(50), author_id " +
                    "int, url varchar(80))");
            System.out.println("Created 'names' table.");
            System.out.println("Inserting authors.");
            s.execute("INSERT INTO names " +
                    "VALUES ('Adams, Douglas', 1," +
                    "'http://www.douglasadams.com')");
            s.execute("INSERT INTO names " +
                    "VALUES ('Simmons, Dan', 2, 'http://www.dansimmons.com')");
            s.execute("INSERT INTO names " +
                    "VALUES ('Stephenson, Neal', 3, " +
                    "'http://www.nealstephenson.com')");
            System.out.println("Authors inserted.");
            conn.close();
        } catch (SQLException err) {
            System.err.println("SQL error.");
            err.printStackTrace(System.err);
            System.exit(0);
        }
    }
}