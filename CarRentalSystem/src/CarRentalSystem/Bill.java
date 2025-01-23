package CarRentalSystem;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    double amount;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.amount = computeAmount();
        isPaid = false;
    }

    private double computeAmount() {
        return 100.0;
    }


}
