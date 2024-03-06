import Creationals.FactoryMethod.Notifications.Factory.EmailNotificationFactory;
import Creationals.FactoryMethod.Notifications.Factory.SMSNotificationFactory;
import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory;
import Structural.Decorator.Notifier.Decorator.FacebookDecorator;
import Structural.Decorator.Notifier.Decorator.WhatsAppDecorator;
import Structural.Decorator.Notifier.INotifier;
import Structural.Decorator.Notifier.Notifier;

public class Main {
    public static void main(String[] args) {

        /**
         * The client code works with an instance of a concrete creator, albeit
         * through its base interface. As long as the client keeps working with the
         * creator via the base interface, you can pass it any creator's subclass.
         */
        NotificationFactory factory =new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser();

        NotificationFactory factory2 =new SMSNotificationFactory();
        Notification notification2 = factory2.createNotification();
        notification2.notifyUser();


        System.out.println("**************");

        // Decorator

        INotifier notifier = new Notifier("John");
        notifier.send("test premier message only mail to Jhon");
        System.out.println("---");

        INotifier notifierWithDecorator = new FacebookDecorator(notifier);
        notifierWithDecorator.send("test second message mail and facebook to Jhon");
        System.out.println("---");

        INotifier notifierWithDecorator2 = new WhatsAppDecorator(notifier);
        notifierWithDecorator2.send("test second message mail and what's app to Jhon");
        System.out.println("---");

        INotifier notifierWithDecorator3 = new WhatsAppDecorator(notifierWithDecorator);
        notifierWithDecorator3.send("test thrid message mail, fb and what's app to Jhon");

    }
}