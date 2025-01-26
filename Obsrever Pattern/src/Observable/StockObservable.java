package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {

    void addItem(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
