interface PaymentStrategy {
    void pay(double amount);
}
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
        // Add logic to process payment
    }
}
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
        // Add logic to process payment
    }
}
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create CreditCardPayment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");

        // Create PayPalPayment strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        // Create PaymentContext with CreditCardPayment strategy
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(100.00); // Pay using Credit Card

        // Change strategy to PayPalPayment
        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(200.00); // Pay using PayPal
    }
}
