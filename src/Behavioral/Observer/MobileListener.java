package Behavioral.Observer;

public class MobileListener implements EventListener {
    private final String num;

    public MobileListener(String num) {
        this.num = num;
    }

    @Override
    public void update(Event eventType) {

        if(eventType == Event.NEW_ITEM){
            System.out.println("Email to " + num + " new item !");
        }else{
            System.out.println("Email to " + num + " new promotion !");
        }
    }
}
