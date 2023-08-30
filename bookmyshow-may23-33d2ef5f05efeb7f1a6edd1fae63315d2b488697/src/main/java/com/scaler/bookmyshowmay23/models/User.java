package com.scaler.bookmyshowmay23.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// Entity helping us to map the entity with DB table
//The @Entity annotation is a JPA (Java Persistence API)
// marker annotation used to specify that a particular class
// should be mapped to a database table.
@Getter
@Setter
@Table(name = "users")
//The @Table annotation in JPA (Java Persistence API) is
// used to specify additional details about
// how a given entity class maps to a database table.
public class User extends BaseModel {
    private String email;
}