import Creationals.FactoryMethod.Notifications.Factory.EmailNotificationFactory;
import Creationals.FactoryMethod.Notifications.Factory.SMSNotificationFactory;
import Creationals.FactoryMethod.Notifications.Interfaces.Notification;
import Creationals.FactoryMethod.Notifications.Interfaces.NotificationFactory;
import Structural.Decorator.Notifier.Decorators.FacebookDecorator;
import Structural.Decorator.Notifier.Decorators.WhatsAppDecorator;
import Structural.Decorator.Notifier.INotifier;
import Structural.Decorator.Notifier.Notifier;
import Structural.Proxy.Internet.Internet;
import Structural.Proxy.Internet.ProxyInternet;
import Structural.Proxy.Internet.RealInternet;
import Structural.Proxy.Video.ProxyVideoDownloader;
import Structural.Proxy.Video.RealVideoDownloader;
import Structural.Proxy.Video.VideoDownloader;

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
        notifier.send("first message only mail to Jhon");

        INotifier notifierWithDecorator = new FacebookDecorator(notifier);
        notifierWithDecorator.send("mail and facebook to Jhon");

        INotifier notifierWithDecorator2 = new WhatsAppDecorator(notifier);
        notifierWithDecorator2.send("mail and what's app to Jhon");

        INotifier notifierWithDecorator3 = new WhatsAppDecorator(notifierWithDecorator);
        notifierWithDecorator3.send("mail, fb and what's app to Jhon");
        System.out.println("**************");

        // proxy
        System.out.println("------ without proxy --------");

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        VideoDownloader videoDownloader = new RealVideoDownloader();
        videoDownloader.getVideo("1234");
        videoDownloader.getVideo("1234");
        System.out.println("------ with proxy --------");

        // here, even if the video is already downloaded, the server will be called again. S
        // O use, a proxy caching data.

        VideoDownloader withProxy = new ProxyVideoDownloader();
        withProxy.getVideo("1234");
        withProxy.getVideo("1234");


    }
}