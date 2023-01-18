package problem.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class Student {

    private String studentId;
    private Date studentDOB;
    private String address;

    /**
     * We can see that the Student class is tightly coupled with database layer we use at the back end, The student class should only deal with
     * only student functionality and not to multiple functions like dealing with the DATABASE and Getting studentId and studentDOB
     * So Tight coupled is bad in software, How de we fix this ? Please see the solution package
     */


    // let's define all possible change that can be add in the future

    // 1) A change of the attributes like studentId and studentDOB and address
    // 2) A change in the DATABASE backend as advised by the technical team

    // So there is more than one reason to change the Student class


    /*
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
    */
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
