import java.util.Scanner;

//parent class

class Vehicle{
    int regno;
    double daily_rent;

    //constuctor

    Vehicle(int regno,double daily_rent){
        this.regno = regno;
        this.daily_rent = daily_rent;
    }

    double computeRent(int days){
        return daily_rent * days;
    }
}

class Car extends Vehicle{

    int no_doors;
    //constructor
    Car(int regno,double daily_rent,int no_doors){

        super(regno, daily_rent);

        this.no_doors = no_doors;
    }

    @Override
    double computeRent(int days){
        return super.computeRent(days)+200;
    }
}


public class CARSUBCLASS {

    public static void main(String[] args){
        Vehicle v1 = new Vehicle(20001,400);

        System.out.println(v1.computeRent(4));

        Car c1 = new Car(2004,500,2);

        System.out.println("no of doors: "+c1.no_doors);

        System.out.println("daily rent:"+c1.computeRent(5));


    }


}
