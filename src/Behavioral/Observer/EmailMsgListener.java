package Behavioral.Observer;

public class EmailMsgListener implements EventListener {

    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }
    @Override
    public void update(Event eventType) {

        if(eventType == Event.NEW_ITEM){
            System.out.println("Email to " + email + " new item !");
        }else{
            System.out.println("Email to " + email + " new promotion !");
        }
    }

}
