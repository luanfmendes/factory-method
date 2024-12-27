package notification;

import org.example.notification.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryTest {

    @Test
    public void testEmailNotificationFactory() {
        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    public void testSMSNotificationFactory() {
        NotificationFactory factory = new SMSNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof SMSNotification);
    }

    @Test
    public void testPushNotificationFactory() {
        NotificationFactory factory = new PushNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof PushNotification);
    }
}
