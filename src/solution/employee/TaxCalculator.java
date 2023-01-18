package solution.employee;


public class TaxCalculator {

    public void calculateTax(Employee employee){
        if(employee.getEmployeeType().equals("fulltime")){
            // tax calculate for full time employee
        }
        if(employee.getEmployeeType().equals("contract")){
            // tax calculate for contractors
        }
    }
}
