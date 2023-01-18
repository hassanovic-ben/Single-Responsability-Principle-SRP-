package problem.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType;

    /**
     * Check the reasons to change the class
     * 1) changes the employee attributes
     * 2) changes in DataBase
     * 3) Changes in Tax Calculation
     *
     * So this class has three reasons to change the class
     *
     */

    public void save(){

        String queryValue = this.getEmployeeName() + "" + this.getEmployeeAddress() + "" + this.getEmployeeType() + "" + this.getContactNumber();
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            statement = connection.createStatement();
            statement.execute("INSERT INTO EMPLOYEE VALUES (queryValue)");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void calculateTax(Employee employee){
        if(employee.getEmployeeType().equals("fulltime")){
            // tax calculate for full time employee
        }
        if(employee.getEmployeeType().equals("contract")){
            // tax calculate for contractors
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
