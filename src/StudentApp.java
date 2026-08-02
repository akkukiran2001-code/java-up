//class
class Students{
    //data
    String name;
    int age;
    int roll_number;
    String course;

    // constructor
    Students(String n,int a,int r,String c){
        name = n;
        age = a;
        roll_number = r;
        course = c;

    }
    void study(){
        System.out.println(name + " is studying");
    }

    void attend(){
        System.out.println(name+" is attending class");
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("roll_number: "+ roll_number);
        System.out.println("Course: "+course);
    }

}



public class StudentApp {
    public static void main (String[] args){
        Students s1 = new Students("Kiran",24,136,"MCA");

        System.out.println(s1.name);

        s1.display();
        s1.study();
        s1.attend();

    }
}



