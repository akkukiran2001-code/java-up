// Superclass
class Employee1 {

    void calculateSalary() {
        System.out.println("Employee Salary");
    }
}

// Subclass Manager
class Manager extends Employee1 {

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: Rs. 80,000");
    }
}

// Subclass Developer
class Developer extends Employee1 {

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary: Rs. 60,000");
    }
}

// Subclass Intern
class Intern extends Employee1 {

    @Override
    void calculateSalary() {
        System.out.println("Intern Salary: Rs. 15,000");
    }
}

// Main class
public class Employees1 {
    public static void main(String[] args) {

        Employee1 emp;

        emp = new Manager();
        emp.calculateSalary();

        emp = new Developer();
        emp.calculateSalary();

        emp = new Intern();
        emp.calculateSalary();
    }
}