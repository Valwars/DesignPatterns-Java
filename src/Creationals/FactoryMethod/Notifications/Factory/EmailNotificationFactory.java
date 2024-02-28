package Creationals.FactoryMethod.Notifications.Factory;

import Creationals.FactoryMethod.Notifications.EmailNotification;
import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory;

/**
 * Concrete creators override the factory method to change the resulting
 * product's type.
 * Here, this factoru creates an EmailNotification.
 */
public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
