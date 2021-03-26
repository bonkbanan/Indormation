package com.company;

import java.time.Month;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Information pupil= new Information();
    pupil.setpType(PeopleType.STUDENT);
    pupil.setFirstName("Denys");
    pupil.setMidName("Balan");
    pupil.setThirdName("Yurievich");
    pupil.setDateOfBirth(LocalDate.of(2006, Month.APRIL,12));
    pupil.setCity("Chernivtsi");
    pupil.setStreet("Pushkina");
    pupil.setHouse("5");
    pupil.setPhoneNumber("8800355535");
    pupil.setCourse(3);
    pupil.setDateOfEntry(LocalDate.of(2018,Month.SEPTEMBER,1));
    pupil.setFirstNameMother("Katya");
    pupil.setMidNameMother("I dont know what can image");
    pupil.setThirdNameMother("I dont know what can image");
    }
}
