package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(Event.NEW_ITEM, new EmailMsgListener("vlt.merault@gmail.com"));
        notificationService.subscribe(Event.SALE,new MobileListener("07 83 83 42 98"));

        Store store = new Store(notificationService);

        // send email to customers
        store.newItemPromotion(Event.NEW_ITEM);
        store.newItemPromotion(Event.SALE);
    }
}
