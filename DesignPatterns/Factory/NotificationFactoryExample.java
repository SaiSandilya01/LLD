package DesignPatterns.Factory;

// 1. The Interface
interface Notification {
    void send();
}

// 2. Concrete implementations
class EmailNotification implements Notification {
    public void send() { System.out.println("Sending Email..."); }
}

class SMSNotification implements Notification {
    public void send() { System.out.println("Sending SMS..."); }
}

// 3. The Factory Class (Your "ObjectCreator")
class NotificationFactory {
    
    // It takes a string and returns the Interface
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Unknown notification type");
    }
}

// 4. The Client (UserService)
public class NotificationFactoryExample {
    public static void main(String[] args) {
        
        // The UserService now has ZERO 'if-else' logic. 
        // It simply asks the Factory for an object and uses it.
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.send();
        
    }
}
