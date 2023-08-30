package com.scaler.bookmyshowmay23.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "theatre")
    private List<Theatre> theatres;
}

// String Utils - Apache
// Google Lib - Google

// Boiler Plate Coding
