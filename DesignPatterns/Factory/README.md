# Factory Pattern (Notification Service)

The Factory Pattern is a Creational design pattern that provides an interface for creating objects but allows subclasses or a centralized class to alter the type of objects that will be created.

## The "Main" Problem: New is Glue
Whenever you see the `new` keyword in your business logic, you are "gluing" your code to a specific implementation. If that implementation changes, your business logic breaks. The Factory pattern "un-glues" this.

## Our Implementation
We built a **Notification Service**:
- **Product Interface**: `Notification`.
- **Concrete Products**: `SMSNotification`, `EmailNotification`.
- **Factory Class**: `NotificationFactory` (The Object Creator).

### Key Takeaways & Best Practices
1. **Defensive Programming**: We used `"SMS".equals(type)` instead of `type.equals("SMS")` to avoid `NullPointerException` if the type is null.
2. **Error Handling**: The Factory should throw a `RuntimeException` (like `IllegalArgumentException`) when an unknown type is passed.
3. **Encapsulation**: We centralized the `if-else` logic so the "Client" (Main.java) has zero knowledge of the concrete classes.

## Reflection & Interview Notes
- **When to use**: When the exact types and dependencies of objects are unknown until runtime.
- **Single Responsibility**: The Factory handles *creation*, the main class handles *execution*.
- **Trade-offs**: 
    - **Complexity**: Adds more classes/interfaces.
    - **Abstraction**: Can be over-engineered for simple projects.

## Code Example
```java
// Client code - No 'new' keyword, no if-else!
Notification myNotif = NotificationFactory.getNotification("SMS");
myNotif.send("Hello Factory!");
```
