//employee class
class Employee{
    private String name;
    int id;
    String role;
    double salary;

    //constructor
    Employee(String n,int i,String r,double s){
        this.name = n;
        id = i;
        role = r;
        salary = s;
    }

    void Increase(){

        System.out.println("increased salary is: "+(salary*1.5));

    }

    void NameRole(){
        System.out.println("name: "+ name +" and role is:"+ role);
    }

}
public class NEW_Employee {
    public static void main(String[] args){

        Employee e1 = new Employee("Kiran",21134,"manager",5500);

        e1.Increase();
        e1.NameRole();

    }
}
