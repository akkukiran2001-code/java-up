import java.util.Scanner;
public class SampleCalculator {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1  = input.nextInt();

        System.out.print("enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int mult = num1 * num2;
        int subs = num1 - num2;
        double div = (double) num1 / num2;
        System.out.println("Sum :"+ sum);
        System.out.println("multiplication "+mult);
        System.out.println("sub "+subs);
        System.out.println("div "+div);

    }

}
