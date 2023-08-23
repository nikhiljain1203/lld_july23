package Service;

import Excpetions.NoParkingSpotFoundException;
import Models.*;
import Repository.TicketRepository;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;

    private ParkingLotService parkingLotService;

    private TicketRepository ticketRepository;
    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, Long gateId)
            throws NoParkingSpotFoundException {
        /*
        Flow :-
            -> Get the vehicle details from the DB, if the Vehicle is not present then
            create a vehicle object and store in the DB.
         */
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        if(vehicle == null) {
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGateUsingId(gateId);

        // Spot Assigment strategy to be part parking lot service
        ParkingSpot parkingSpot = parkingLotService.getparkingSpot(vehicle, gate);

        if(parkingSpot == null) {
            throw new NoParkingSpotFoundException("No Parking Spot Available");
        }

        // upadte parking spot
        //ParkingSpot parkingSpot = parkingSpotService.assignParkingSpot(parkingSpot);

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());
        ticket.setParkingSpot(parkingSpot);

        ticketRepository.saveTicket(ticket);

        return ticket;
    }
}
