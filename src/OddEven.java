import java.util.Scanner;
public class OddEven {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = input.nextInt();

        if (num%2 == 0)
        {

            System.out.println("The given number "+num+ " is even");

        }else {

            System.out.println("the given number is odd" + num);


        }
    }
}
