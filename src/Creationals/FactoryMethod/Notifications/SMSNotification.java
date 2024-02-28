package Creationals.FactoryMethod.Notifications;

import Creationals.FactoryMethod.Notifications.Interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification.");
    }
}