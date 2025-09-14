package JavaRecap;

public abstract class Employee implements SalariedEntity{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }

    public String getName(){
        return this.name;
    }

    @Override
    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double percent){
        this.salary = salary * (percent + 1);
    }
}