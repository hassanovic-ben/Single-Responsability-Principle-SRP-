package solution.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {

    public void saveEmployee(Employee employee){

        String objString = employee.getEmployeeName() + "" + employee.getEmployeeAddress() + "" + employee.getEmployeeType() + "" + employee.getContactNumber();
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            statement = connection.createStatement();
            statement.execute("INSERT INTO EMPLOYEE VALUES (objString)");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
