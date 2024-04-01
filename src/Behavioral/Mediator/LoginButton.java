package Behavioral.Mediator;

import javax.swing.*;

public class LoginButton extends JButton implements Component {

    private Mediator mediator;

    public LoginButton() {
        super("Login");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void firedActionPerformed() {
        mediator.login();
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
