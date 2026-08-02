import java.util.Scanner;
public class NameAge {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = input.nextLine();

        System.out.print("enter your age: ");
        int age = input.nextInt();

        System.out.println("hi");
        System.out.println("your name is "+ name);
        System.out.println("you are "+ age + " years old");

    }
}
