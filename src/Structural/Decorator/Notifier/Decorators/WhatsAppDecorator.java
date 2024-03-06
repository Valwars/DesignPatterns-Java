package Structural.Decorator.Notifier.Decorators;


import Structural.Decorator.Notifier.BaseNotifierDecorator;
import Structural.Decorator.Notifier.INotifier;

public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("WhatsApp: " + message);
    }
}
