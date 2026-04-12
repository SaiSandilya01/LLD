package DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        // Notification notification;
        NotificationFactory.getNotification("SMS").send("SMS");

        NotificationFactory.getNotification("EMAIL").send("EMAIL notifcaiton");
    }
}
