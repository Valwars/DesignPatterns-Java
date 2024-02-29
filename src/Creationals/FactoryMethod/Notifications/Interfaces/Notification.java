package Creationals.FactoryMethod.Notifications.Interfaces;


/**
 * Interface for the Notification,
 * An Interface is a contract that defines the methods that a class will implement.
 * In this case, the Notification interface is a contract that defines that any class that implements it
 * it has a method to notify the user.
 * Each notification class will have its own implementation of the notifyUser method !
 */
public interface Notification {

    void notifyUser();

}
