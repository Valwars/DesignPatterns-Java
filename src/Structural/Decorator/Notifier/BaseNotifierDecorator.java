package Structural.Decorator.Notifier;

public abstract class BaseNotifierDecorator implements INotifier{
    private final INotifier wrapped;

    protected BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }
    public void send(String message) {
        wrapped.send(message);
    }

    public String getUsername() {
        return wrapped.getUsername();
    }

}
