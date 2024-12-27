package org.example;

import org.example.notification.*;

public class Main {
    public static void main(String[] args) {
        // E-mail
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationService emailService = new NotificationService(emailFactory);
        emailService.sendNotification("Este é um e-mail de notificação!");

        // SMS
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationService smsService = new NotificationService(smsFactory);
        smsService.sendNotification("Este é um SMS de notificação!");

        // Push
        NotificationFactory pushFactory = new PushNotificationFactory();
        NotificationService pushService = new NotificationService(pushFactory);
        pushService.sendNotification("Este é um Push de notificação!");
    }
}