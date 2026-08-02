class Shape{
    private String name;

    //constructor
    Shape(String name){
        this.name = name;
    }
    void describle(){
        System.out.println(name);
    }
}
class Circle extends Shape{

    double radius;

    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    void describle() {
        super.describle();
        System.out.println("Area of the circle: "+(Math.PI*radius*radius));
    }
}
public class Subcircleshape {
    public static void main(String[] args){
        Circle c1 = new Circle("circle",8.6);
        c1.describle();

    }
}

