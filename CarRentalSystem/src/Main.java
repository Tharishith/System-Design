import CarRentalSystem.User;
import CarRentalSystem.VehicleRentalSystem;
import CarRentalSystem.model.Car;
import CarRentalSystem.model.Store;
import CarRentalSystem.model.Vehicle;
import CarRentalSystem.model.VehicleType;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(users,stores);



    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        user1.setUserName("Tharishith");
        users.add(user1);
        return users;
    }

    public static List<Vehicle> addVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleId(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }




}