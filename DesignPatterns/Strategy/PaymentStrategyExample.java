package DesignPatterns.Strategy;

// 1. The Strategy Interface
interface PaymentStrategy {
    void process(double amount);
}

// 2. Concrete Strategy A
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// 3. Concrete Strategy B
class PayPalPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// 4. The Context class
class PaymentProcessor {
    // The processor interacts ONLY with the interface, upholding the Open/Closed Principle
    public void processPayment(PaymentStrategy strategy, double amount) {
        strategy.process(amount);
    }
}

public class PaymentStrategyExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        // At runtime, we inject the specific behavior we want (Dependency Injection)
        PaymentStrategy cc = new CreditCardPayment();
        processor.processPayment(cc, 100.0);
        
        PaymentStrategy paypal = new PayPalPayment();
        processor.processPayment(paypal, 50.0);
    }
}
