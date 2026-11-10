public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(int id, String name, double salary){
        super(id, name);
        this.salary = salary;
    }

    @Override 
    public double calculateSalary(){
        return salary;
    }
}
