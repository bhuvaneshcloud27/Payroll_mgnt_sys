import java.util.ArrayList;

public class PayrollSystem {
 
    private ArrayList<Employee> employees;
    
    public PayrollSystem(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employees){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }

        if(employeeToRemove != null){
            employees.remove(employeeToRemove);
        }
    }

    public void displayEmployees()
    {
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }
}
