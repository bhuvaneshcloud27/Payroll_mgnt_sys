public abstract class Employee {
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    @Override 
    public String toString(){
        return "Name: " + name 
              + " ID " + id
              + " Salary: " + calculateSalary();
    }

    protected abstract double calculateSalary();
}
