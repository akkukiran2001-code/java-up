import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constant
        final double RATE_PER_UNIT = 7.5;

        // Input
        System.out.print("Enter units: ");
        int unitsConsumed = sc.nextInt();

        // Calculate bill
        double billAmount = unitsConsumed * RATE_PER_UNIT;

        // Display result
        System.out.println("Electricity Bill = " + billAmount);

        sc.close();
    }
}