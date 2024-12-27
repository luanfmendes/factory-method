package notification;

import org.example.notification.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class NotificationTest {
    @Test
    public void testSendEmail() {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationService emailService = new NotificationService(emailFactory);
        assertDoesNotThrow(() -> emailService.sendNotification("Mensagem de teste e-mail"));
    }

    @Test
    public void testSendSMS() {
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationService smsService = new NotificationService(smsFactory);
        assertDoesNotThrow(() -> smsService.sendNotification("Mensagem de teste SMS"));
    }

    @Test
    public void testSendPush() {
        NotificationFactory pushFactory = new PushNotificationFactory();
        NotificationService pushService = new NotificationService(pushFactory);
        assertDoesNotThrow(() -> pushService.sendNotification("Mensagem de teste Push"));
    }
}
