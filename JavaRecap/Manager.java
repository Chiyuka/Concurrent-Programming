package JavaRecap;

import java.util.ArrayList;

public class Manager extends Employee {

    ArrayList<Employee> employees;
    
    public Manager(String name, double salary){
        super(name, salary);
        employees = new ArrayList<>();
    }

    @Override
    public double getSalary(){
        double total = super.getSalary();

        for(Employee e : employees){
            total += super.getSalary() * 0.05;
        }
        return total;
    }
}
