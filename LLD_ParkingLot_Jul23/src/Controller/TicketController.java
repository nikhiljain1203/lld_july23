package Controller;

import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import DTO.ResponseStatus;
import Excpetions.NoParkingSpotFoundException;
import Models.Ticket;
import Service.TicketService;

// Interactive or Entity -> Interactive
// API or CMD -> API

public class TicketController {
    TicketService ticketService;

    //generateTicket API will be used by the Client,
    // so it's not a good idea to expose our internal models to the Client.
    //problems with directly involving Models in the Controller API's :-
    //1. If we add/remove models from the input, current clients will start failing.
    //2. We should not expose the Model details to client because of privacy.
    //The solution to this : Data Transfer Objects (DTO).

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(
            GenerateTicketRequestDto generateTicketRequestDto) {
        // business logic
        // 1. Get Vehicle from the DB
        // 2. Add vehicle in DB

        // 2 Ways
        // 1. Repo to insert data Repo.insertVehicle()
        // 2. Service to handle this Service.insertVehicle(); :: Better Approach

        // always pass only required details to service.
        // Not all details of request are applicable for all service

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();

        try {
            Ticket ticket = ticketService
                    .generateTicket(generateTicketRequestDto.getVehicleNumber(),
                    generateTicketRequestDto.getVehicleType(),
                    generateTicketRequestDto.getGateId());
            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (NoParkingSpotFoundException e) {
            responseDto.setResponseStatus(ResponseStatus.FALIURE);
            responseDto.setResponseMessage(e.getMessage());
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FALIURE);
            responseDto.setResponseMessage(e.getMessage());
        }
        return responseDto;
    }
}
