package Creationals.FactoryMethod.Notifications;

import Creationals.FactoryMethod.Notifications.Interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification.");
    }
}
