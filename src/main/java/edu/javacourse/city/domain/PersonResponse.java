package edu.javacourse.city.domain;

import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter
@Setter

public class PersonResponse {
    private boolean registered;
    private boolean temporal;

    public PersonResponse() {
    }

    public PersonResponse(boolean registered, boolean temporal) {
        this.registered = registered;
        this.temporal = temporal;
    }
}
