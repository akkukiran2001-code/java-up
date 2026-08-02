import payment.*;
public class paymentheirpack {

    public static void main(String[] args){
        PaymentMethod p;

        p = new CreditCard();
        p.pay(300);

        p = new UPI();
        p.pay(4000);

    }

}
