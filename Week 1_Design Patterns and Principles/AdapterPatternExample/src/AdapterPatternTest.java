interface PaymentProcessor {
    void processPayment(double amount);
}
class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
class Stripe {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
class Square {
    public void executePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }
}
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}
class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}
class SquareAdapter implements PaymentProcessor {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void processPayment(double amount) {
        square.executePayment(amount);
    }
}

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using PayPal through the adapter
        PayPal payPal = new PayPal();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(100.0);

        // Using Stripe through the adapter
        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(200.0);

        // Using Square through the adapter
        Square square = new Square();
        PaymentProcessor squareProcessor = new SquareAdapter(square);
        squareProcessor.processPayment(300.0);
    }
}
