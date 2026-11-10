public class PartTimeEmployee extends Employee{

    private int hours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hours, double hourlyRate){
        super(id, name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override 
    public double calculateSalary(){
        return hours * hourlyRate;
    }
    
}
