package Creationals.FactoryMethod.Notifications.Factory;

import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory;
import Creationals.FactoryMethod.Notifications.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}