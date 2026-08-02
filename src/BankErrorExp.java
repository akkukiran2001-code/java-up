import java.util.Scanner;
class InsufficientFundExpention extends Exception{
    InsufficientFundExpention(String messages){
        super(messages);
    }

}
class BankAccount{
    double Balance;

    BankAccount(double Balance){
        this.Balance = Balance;
    }

    void withdraw(double amount) throws InsufficientFundExpention{
        if(amount > Balance){
            throw new InsufficientFundExpention("insufficient balance"+ Balance);
        }
        Balance = Balance - amount;
        System.out.println("withdrawed successfully");
        System.out.println("The remaining balance is: "+ Balance);

    }
}
public class BankErrorExp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        BankAccount b = new BankAccount(2000);

        try{
            System.out.println("Enter the amount that you want to withdraw: ");
            double amount = input.nextDouble();
            b.withdraw(amount);
        }catch(InsufficientFundExpention e){

            System.out.println("sorry "+e.getMessage());

        }catch (Exception e){
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }
}
