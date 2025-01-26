package Observer;

import Observable.StockObservable;

public class EmailNotificationObserver implements  NotificationAlertObserver{

    StockObservable stockObservable;
    String emailId;

    public EmailNotificationObserver(StockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in stock hurry");
    }

    private void sendMail(String emailIfd, String message) {
        System.out.println("Mail sent to email Id : "+ emailId + "with message : " + message);
    }

}
