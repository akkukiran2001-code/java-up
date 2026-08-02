package hr;

public class FullTimeEmployee extends Employee implements Taxable{

    @Override
    public void calculateSalary() {
        System.out.println(2000);
    }

    @Override
    public void calculateTax() {

        System.out.println(2000*0.10);

    }
}
