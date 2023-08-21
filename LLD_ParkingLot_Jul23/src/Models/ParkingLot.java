package Models;

import java.util.List;

public class ParkingLot extends BaseEntity{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private String name;
    private String address;
}
