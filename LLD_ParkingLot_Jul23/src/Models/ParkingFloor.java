package Models;

import java.util.List;

public class ParkingFloor extends BaseEntity{
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;
}
