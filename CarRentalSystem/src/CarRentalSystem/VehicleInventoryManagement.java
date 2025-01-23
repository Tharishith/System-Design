package CarRentalSystem;

import CarRentalSystem.model.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehicleList;

    VehicleInventoryManagement(List<Vehicle> vehicleList){
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
