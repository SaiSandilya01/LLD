# Strategy Pattern

The Strategy Pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

In this example (`PaymentStrategyExample.java`), we achieve this by defining a `PaymentStrategy` interface. Concrete strategies like `CreditCardPayment` and `PayPalPayment` implement this interface. A `PaymentProcessor` context class accepts any object implementing this interface dynamically via dependency injection, allowing for easy extension without modifying existing code (upholding the Open/Closed Principle).
