package Structural.Decorator.Decorator;

import Structural.Decorator.BaseNotifierDecorator;
import Structural.Decorator.INotifier;

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
