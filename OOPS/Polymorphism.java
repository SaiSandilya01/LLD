package OOPS;

interface Notification {
    void send();
}

class EmailNotification implements Notification {
    @Override
    public void send() { 
        System.out.println("Sending Email..."); 
    }
}

class SMSNotification implements Notification {
    @Override
    public void send() { 
        System.out.println("Sending SMS..."); 
    }
}

public class Polymorphism {
    
    // This method depends on the Interface (Abstraction), not a concrete class
    // This is runtime polymorphism.
    public static void notifyUser(Notification notification) {
        notification.send();
    }

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        
        notifyUser(email);
        notifyUser(sms);
    }
}
