package Creationals.FactoryMethod.Notifications;

import Creationals.FactoryMethod.Notifications.Interfaces.Notification;

/**
 * Each concrete product of the factory will have its own implementation of the notifyUser method.
 * Here, the EmailNotification class has its own implementation of the notifyUser method.
 */
public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification.");
    }
}
