// Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

//child
class Dog extends Animal {

    Dog(String name) {
        super(name); // Calls parent constructor
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog("Tommy");

        d1.eat();   // Inherited method
        d1.bark();  // Child method
    }
}