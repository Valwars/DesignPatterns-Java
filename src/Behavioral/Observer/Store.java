package Behavioral.Observer;

public class Store {

    private final NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotion(Event eventType) {
        notificationService.notifyCustomers(eventType);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
