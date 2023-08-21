package Models;

import java.util.Date;

public class Ticket extends BaseEntity {
    private Date entryTime;
    private Operator operator;
    private Gate gate;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
}
