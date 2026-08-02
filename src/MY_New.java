class Mynames{
    private String name;
    int age;
    double weight;
    String place;

    //constructor
    Mynames(String n,int a,double w,String p){
        this.name = n;
        this.age = a;
        this.weight = w;
        this.place = p;
    }

    //methods
    void setprivate(String n){
        this.name = n;
    }
    void get_private(){
        System.out.println("name :"+this.name);
    }
    void doing(){
        System.out.println(name+" is studying");
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("age; "+age);
        System.out.println("Weight: "+weight);
        System.out.println("Place: "+place);
    }
}
public class MY_New {
    public static void main(String[] args){
        Mynames m1 = new Mynames("Manu",21,15.77,"myanmar");
        m1.setprivate("Kiran");
        m1.age = 24;
        m1.weight = 66.7;
        m1.place = "Mundakayam";
        m1.doing();
        m1.display();
        m1.get_private();

    }
}
