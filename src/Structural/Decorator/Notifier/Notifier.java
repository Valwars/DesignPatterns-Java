package Structural.Decorator.Notifier;

public class Notifier implements INotifier {

    private final String username;

    public Notifier(String username) {
        this.username = username;
    }
    @Override
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }

    @Override
    public String getUsername() {
        return null;
    }
}
