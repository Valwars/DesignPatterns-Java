package Behavioral.Mediator;

import javax.swing.*;

public class Dialog extends JDialog implements Mediator{

    private JTextField userTextBox;
    private JTextField passTextBox;
    private LoginButton loginButton;


    public Dialog() {
        userTextBox = new JTextField();
        passTextBox = new JTextField();
        loginButton = new LoginButton();

        userTextBox.setText("Username");
        passTextBox.setText("Password");

        loginButton.setMediator(this);

        loginButton.addActionListener(e -> loginButton.firedActionPerformed());

        this.add(userTextBox);
        this.add(passTextBox);
        this.add(loginButton);

    }
    @Override
    public void login() {
        String username = userTextBox.getText();
        String password = passTextBox.getText();

        // handle login logic
        System.out.println("login");

    }


}
