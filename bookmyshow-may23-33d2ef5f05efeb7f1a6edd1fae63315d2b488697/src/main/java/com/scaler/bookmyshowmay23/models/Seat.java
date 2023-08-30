package com.scaler.bookmyshowmay23.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String name;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private int row;
    private int column;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;

}
