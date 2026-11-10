public class Main {
    
    public static void main(String[] args)
    {
        PayrollSystem payrollSystem = new PayrollSystem();
        Employee employee1 = new FullTimeEmployee(1, "John Doe", 10000);
        Employee employee2 = new PartTimeEmployee(2, "Jane Doe", 20, 10);
        payrollSystem.addEmployee(employee1);
        payrollSystem.addEmployee(employee2);
        payrollSystem.displayEmployees();
        System.out.println("Removing employee with id 1");
        payrollSystem.removeEmployee(1);
        payrollSystem.displayEmployees();
    }
}
