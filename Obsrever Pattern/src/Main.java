import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailNotificationObserver;
import Observer.MobileNotificationObserver;
import Observer.NotificationAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailNotificationObserver(iphoneObservable,"abc@gmail.com");
        NotificationAlertObserver observer2 = new EmailNotificationObserver(iphoneObservable,"ptr@gmail.com");
        NotificationAlertObserver observer3 = new MobileNotificationObserver("Surya", iphoneObservable);

        iphoneObservable.addItem(observer1);
        iphoneObservable.addItem(observer2);
        iphoneObservable.addItem(observer3);

        iphoneObservable.setStockCount(10);
    }
}