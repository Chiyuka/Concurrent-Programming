package JavaRecap;

import java.util.List;
import java.util.ArrayList;

public class Comp {
    private List<SalariedEntity> salariedEntities;

    public Comp(){
        this.salariedEntities = new ArrayList<>();
    }

    public List<SalariedEntity> getSalariedEntities(){
        return this.salariedEntities;
    }

    public void addSalariedEntity(SalariedEntity s){
        this.salariedEntities.add(s);
    }

    public void deleteSalariedEntity(SalariedEntity s){
        this.salariedEntities.remove(s);
    }

    public void raiseSalariesForEmployees(double percent){
        for(SalariedEntity employee : salariedEntities){
            if(employee instanceof Employee){
                Employee emp = (Employee) employee;
                emp.raiseSalary(percent);
            }
        }
    }
}
