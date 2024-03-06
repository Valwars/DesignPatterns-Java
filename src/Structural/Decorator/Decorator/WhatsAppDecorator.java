package Structural.Decorator.Decorator;

import Structural.Decorator.BaseNotifierDecorator;
import Structural.Decorator.INotifier;

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
