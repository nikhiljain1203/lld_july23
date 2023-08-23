package Strategy;

import Models.Gate;
import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Models.VehicleType;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType,
                                  Gate gate, List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                    parkingSpot.getSupportedVehicleTypes().contains(vehicleType)) {
                return parkingSpot;
            }
        }
        return null;
    }
}
