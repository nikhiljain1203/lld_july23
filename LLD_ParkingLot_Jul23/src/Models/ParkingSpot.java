package Models;

import java.util.List;

public class ParkingSpot extends BaseEntity{
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor;
    private List<VehicleType> supportedVehicleTypes;
    private int number;
}
