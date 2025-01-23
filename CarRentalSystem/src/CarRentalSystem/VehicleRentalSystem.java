package CarRentalSystem;

import CarRentalSystem.model.Store;

import java.util.List;

public class VehicleRentalSystem {

    List<User> userList;
    List<Store> storeList;

    public VehicleRentalSystem(List<User> users,List<Store> stores){
        this.storeList = stores;
        this.userList = users;
    }

    public Store getStore(Location location){
        return storeList.get(0);
    }


}
