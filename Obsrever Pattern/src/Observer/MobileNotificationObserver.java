package Observer;

import Observable.StockObservable;

public class MobileNotificationObserver implements NotificationAlertObserver {


    StockObservable observable;
    String userName;

    public MobileNotificationObserver(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName,"Product is in stock hurry");
    }

    private void sendMessageOnMobile(String userName, String msg) {
        System.out.println("Message send to "+ userName);
    }

}
