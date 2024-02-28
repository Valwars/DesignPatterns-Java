import Creationals.FactoryMethod.Notifications.Factory.EmailNotificationFactory;
import Creationals.FactoryMethod.Notifications.Factory.SMSNotificationFactory;
import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory;

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
    }
}