class EmployeeH{
    String name;
    double salary;
    final String companyName;

    //constructor
    EmployeeH(String name,double salary,String companyName){
       this.name =name;
       this.salary = salary;
       this.companyName = companyName;
    }

    void calculate(){
        System.out.println("Bonus:"+(salary*0.5));
    }
}
class ManagerH extends EmployeeH{

    ManagerH(String name,double salary,String companyName){
        super(name,salary,companyName);
    }

    @Override
    void calculate() {
        System.out.println("Bonus of manager: "+(salary*0.10));
    }
}
class SeniorManagerH extends ManagerH{
    double retention_bonu;
    SeniorManagerH(String name,double salary,String companyName,double retention_bonu) {
        super(name, salary, companyName);
        this.retention_bonu = retention_bonu;
    }

    @Override
    void calculate() {
        System.out.println("Bonus of manager: "+((salary*0.15)+retention_bonu));
    }

}
public class BonusChainHierarchy {
    public static void main(String[] args){
        ManagerH m1 = new ManagerH("kiran",5000,"myso");
        m1.calculate();

        SeniorManagerH s1 = new SeniorManagerH("varun",7000,"myso",200);
        s1.calculate();

        EmployeeH e;

        e = new ManagerH("jack",5000,"koso");
        e.calculate();

        e = new SeniorManagerH("sona",6500,"jackso",200);
        e.calculate();

        EmployeeH[] employeeHS = new EmployeeH[3];

        employeeHS[0] = new ManagerH("rose",4500,"info");
        employeeHS[1] = new EmployeeH("manu",3000,"info");
        employeeHS[2] = new SeniorManagerH("delna",8000,"info",200);

        employeeHS[0].calculate();



    }
}
