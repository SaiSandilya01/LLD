package DesignPatterns.Factory;

public class NotificationFactory {

    public static Notification getNotification(String type) {

        if (type.equals("SMS")) {
            return new SMSNotification();
        } else if (type.equals("EMAIL")) {
            return new EmailNotification();
        }
        throw new IllegalArgumentException("Unknown notificaiton type" + type);

    }

}
