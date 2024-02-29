package Creationals.FactoryMethod.Notifications.Factory;

import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.SMSNotification;

/**
 * Concrete creators override the factory method to change the resulting
 * product's type.
 * Here, this factoru creates an SMSNotificationFactory.
 */
public class SMSNotificationFactory  extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}