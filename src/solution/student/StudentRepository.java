package solution.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentRepository {

    public void save(){

        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc://mysql://localhost:3306/MyDB", "root","password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO STUDENT VALUES ()");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
