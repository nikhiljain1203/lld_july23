package Strategy;

import Models.Gate;
import Models.ParkingSpot;
import Models.VehicleType;

import java.util.List;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate, List<ParkingSpot> parkingSpotList);
}
