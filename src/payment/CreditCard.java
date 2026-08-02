//C:\Users\akkuk\IdeaProjects\javastudy\src\payment\CreditCard.java

package payment;

public class CreditCard extends PaymentMethod{

    @Override
    public void pay(double amount){

        System.out.println("Payed "+amount+" using credit card");
    }
}
