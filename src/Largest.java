import java.util.Scanner;

import static javax.management.Query.and;

public class Largest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three different numbers");

        System.out.print("Enter the 1st number");
        int num1 = input.nextInt();

        System.out.print("Enter the 2nd number");
        int num2 = input.nextInt();

        System.out.print("Enter the 3rd number");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3){
            
            System.out.print(num1+ " is the largest");

        } else if (num2 >= num1 && num2 >= num3) {

            System.out.print(num2+ " is the largest");
            
        }else {

            System.out.print(num3+ " is the largest");

        }

    }
}
