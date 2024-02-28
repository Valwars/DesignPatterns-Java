package Creationals.FactoryMethod.Notifications.Factory;

import Creationals.FactoryMethod.Notifications.EmailNotification;
import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
