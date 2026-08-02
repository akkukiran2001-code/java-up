import java.util.Scanner;
public class Count_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int n = input.nextInt();

        int evenCount = 0;
        int sumeven = 0;
        int largest = 0;

        for(int i = 1; i <= n; i++ ){

            if ( i%2 == 0) {

                System.out.println(i);

                evenCount++;
                sumeven+=i;
            }
            if (i%5==0){

                largest = i;
            }


        }
        System.out.println("Total Count of even Number:"+evenCount);
        System.out.println("Sum of Even numper:"+sumeven);
        System.out.println("The largest number divisible by 5:"+largest);

    }
}
