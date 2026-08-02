// Class 1: Student
class Student {

    String name;
    int mark1, mark2;

    void getData(String n, int m1, int m2) {
        name = n;
        mark1 = m1;
        mark2 = m2;
    }
}

// Class 2: Result
class Result {

    void calculate(Student s) {

        int total = s.mark1 + s.mark2;
        double average = total / 2.0;

        System.out.println("Student Name : " + s.name);
        System.out.println("Mark 1       : " + s.mark1);
        System.out.println("Mark 2       : " + s.mark2);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
    }
}

// Class 3: Main
public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.getData("Rahul", 85, 90);

        Result r = new Result();

        r.calculate(s);
    }
}