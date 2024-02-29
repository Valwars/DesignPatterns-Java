package Creationals.FactoryMethod.Notifications.Factory;


import Creationals.FactoryMethod.Notifications.Interfaces.Notification;

public abstract class NotificationFactory  implements Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory {

    public abstract Notification createNotification();

}
