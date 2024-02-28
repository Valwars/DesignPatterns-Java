package Creationals.FactoryMethod.Notifications.Interfaces;

/**
 * The NotificationFactory interface declares the factory method that is
 * supposed to return an object of a Notification class.
 * This interface is the contract for all concrete factories to implement.
 */
public interface NotificationFactory {
    Notification createNotification();
}
