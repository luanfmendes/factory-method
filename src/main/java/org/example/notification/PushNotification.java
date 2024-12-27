package org.example.notification;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando push com a mensagem: " + message);
    }
}
