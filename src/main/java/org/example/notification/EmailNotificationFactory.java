package org.example.notification;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
