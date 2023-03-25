import java.sql.*;

public class DBase {
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static void main(String[] args) {

        // Myframe3 frame=new Myframe3();
        try {
            Class.forName(driver);
            System.out.println("Loaded the embedded driver.");
        } catch (Exception err) {
            System.err.println("Unable to load the embedded driver.");
            err.printStackTrace(System.err);
            System.exit(0);
        }
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:sqlserver://DESKTOP-IJRRINU\\SQLEXPRESS6; Databasename = student;encrypt=true;"
                            +
                            "trustServerCertificate=true;IntegratedSecurity=true;");
            System.out.println("connected");

            String sql = "select* from stu_name";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String fname = resultSet.getString("Fname");
                String lname = resultSet.getString("Lname");

                System.out.println(id + fname + lname);
            }
            String sql2 = "insert into stu_name (id,Fname,Lname) values(3,'baba','ali')";

            Statement statement2 = connection.createStatement();
            int result = statement2.executeUpdate(sql2);
            if (result != 0) {
                System.out.println("data updated");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}