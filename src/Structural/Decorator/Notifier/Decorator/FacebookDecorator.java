package Structural.Decorator.Notifier.Decorator;


import Structural.Decorator.Notifier.BaseNotifierDecorator;
import Structural.Decorator.Notifier.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Facebook: " + message);
    }
}
