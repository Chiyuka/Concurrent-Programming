package JavaRecap;

public class Subordinate extends Employee{
    public Subordinate(String name, double salary){
        super(name, salary);
    }

    @Override
    public double getSalary(){
        return super.getSalary();
    }
}
