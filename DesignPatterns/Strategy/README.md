# Strategy Pattern (Logging System)

The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

## Problem Solved
Avoids "God Classes" and messy `if-else` or `switch` statements when multiple algorithms or behaviors are needed for the same task. It adheres to the **Open/Closed Principle** (Open for extension, Closed for modification).

## Our Implementation
We built a **Logging System** with the following components:
- **Strategy Interface**: `LoggingStrategy` (The contract).
- **Concrete Strategies**: `ConsoleStrategy`, `FileStrategy` (The specific algorithms).
- **Context**: `Logger` (The class that uses the strategy and allows swapping at runtime).

### Key Learning: Constructor vs Setter Injection
1. **Constructor Injection**: used to ensure the object is always in a valid state (avoids `NullPointerException`).
2. **Setter Injection**: allows for dynamic behavior switching at runtime on the *same* object instance.

## Reflection & Interview Notes
- **Why it's better**: Promotes high testability. You can test each strategy in isolation.
- **Trade-offs**: 
    - **Class Explosion**: Number of classes increases.
    - **Client Awareness**: The client code must know about the different strategies to pick one.
- **Real-world Example**: `java.util.Comparator`, Spring `ResourceLoader`.

## Code Example
```java
Logger logger = new Logger(new ConsoleStrategy()); // Constructor injection
logger.process("Hello");

logger.setStrategy(new FileStrategy()); // Runtime swap via Setter
logger.process("Switching to file");
```
