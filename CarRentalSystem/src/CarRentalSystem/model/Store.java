package CarRentalSystem.model;

import CarRentalSystem.Location;
import CarRentalSystem.Reservation;
import CarRentalSystem.User;
import CarRentalSystem.VehicleInventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location location;
    List<Reservation> reservationList = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return vehicleInventoryManagement.getVehicleList();
    }


    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

}
