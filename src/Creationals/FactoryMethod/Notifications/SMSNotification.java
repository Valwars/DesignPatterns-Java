package Creationals.FactoryMethod.Notifications;

import Creationals.FactoryMethod.Notifications.Interfaces.Notification;

/**
 * Each concrete product of the factory will have its own implementation of the notifyUser method.
 * Here, the SMSNotification class has its own implementation of the notifyUser method.
 */
public class SMSNotification implements Notification {

    public void sendSMS() {
        System.out.println("Sending an SMS.");

    }
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification.");
    }
}