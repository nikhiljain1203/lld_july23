package Repository;

import Models.Vehicle;
import Models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    /*
    We can have DB and push the data in DB and rertive it
     */
    Map<String, Vehicle> vehicleStore;

    public VehicleRepository() {
        vehicleStore = new HashMap<>();
    }
    public Vehicle getVehicleFromVehicleNumber(String vehicleNumber) {
        return vehicleStore.get(vehicleNumber);
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        vehicleStore.put(vehicle.getNumber(), vehicle);
    }
}
