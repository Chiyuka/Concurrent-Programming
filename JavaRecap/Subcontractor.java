package JavaRecap;

public class Subcontractor implements SalariedEntity{
    private long tax;

    public Subcontractor(long tax){
        this.tax = tax;
    }

    @Override
    public double getSalary(){
        return 0.0;
    }

    public long getTax(){
        return this.tax;
    }
}
