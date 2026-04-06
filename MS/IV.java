import java.sql.*;

public class IV{
    public static void main(String[] args) {
        try {
            // 1. Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/navadeep",
                "root",
                "Vivobook@2026"
            );

            // 2. Create statement
            Statement stmt = con.createStatement();

            // 3. Execute DELETE query
            String query = "DELETE FROM students WHERE RollNo = 2";
            int rows = stmt.executeUpdate(query);

            // 4. Output
            System.out.println(rows + " row deleted");

            // 5. Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}