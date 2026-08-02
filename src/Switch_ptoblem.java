import java.util.Scanner;
public class Switch_ptoblem {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check the day: ");
        int num = input.nextInt();

        switch(num){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;

            default:
                System.out.println("invalid");
                break;


        }



    }
}
