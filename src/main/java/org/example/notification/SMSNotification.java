package org.example.notification;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS com a mensagem: " + message);
    }
}
