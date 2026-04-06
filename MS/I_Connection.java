import java.sql.*;
public class I_Connection{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/navadeep","root","Vivobook@2026");
            System.out.println("Connected Successfully!");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}