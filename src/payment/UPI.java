package payment;

public class UPI extends PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("payed "+amount+" using upi");

    }
}
