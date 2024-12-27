package org.example.notification;

public class NotificationService {
    private NotificationFactory notificationFactory;
    public NotificationService(NotificationFactory factory) {
        this.notificationFactory = factory;
    }
    public void sendNotification(String message) {
        Notification notification = notificationFactory.createNotification();
        notification.send(message);
    }
}
