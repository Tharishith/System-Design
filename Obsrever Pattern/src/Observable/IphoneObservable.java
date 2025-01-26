package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IphoneObservable implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int stockCount =0;
    @Override
    public void addItem(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {

        if(!notificationAlertObserverList.isEmpty()){
            notificationAlertObserverList.remove(observer);
        }
    }

    @Override
    public void notifySubscribers() {

        if(!notificationAlertObserverList.isEmpty()){
            for(NotificationAlertObserver obj : notificationAlertObserverList){
                obj.update();
            }
        }
    }


    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount += newStockAdded;
    }


    public int getStockCount() {
        return stockCount;
    }
}
