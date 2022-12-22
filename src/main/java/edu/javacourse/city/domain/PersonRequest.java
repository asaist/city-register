package edu.javacourse.city.domain;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class PersonRequest {

    private String surName;
    private String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private int streetCode;
    private String building;
    private String extension;
    private String apartment;

}
