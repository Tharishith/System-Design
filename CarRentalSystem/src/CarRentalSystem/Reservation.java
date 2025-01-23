package CarRentalSystem;

import CarRentalSystem.model.Vehicle;

import java.util.Date;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Date startDate;
    Date endDate;
    Location pickUpLocation;
    Location dropLocation;
    ReservationStatus reservationStatus;
    Location location;
}
