package org.example.notification;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando e-mail com a mensagem: " + message);
    }
}
