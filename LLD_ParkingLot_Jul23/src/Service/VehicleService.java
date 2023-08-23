package Service;

import Models.Vehicle;
import Models.VehicleType;
import Repository.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public Vehicle getVehicle(String vehicleNumber) {
        //VehicleRepository
        return vehicleRepository.getVehicleFromVehicleNumber(vehicleNumber);
    }

    public Vehicle registerVehicle(String vehicleNumber, VehicleType vehicleType) {
        return vehicleRepository.addVehicle(new Vehicle(vehicleType, vehicleNumber));
    }
}
