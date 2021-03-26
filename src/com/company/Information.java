package com.company;/*
@USER: dench
@DATE: 26.03
@NAME: Information
@TIME: 19:58
*/

import java.time.LocalDate;
import java.time.Month;

public class Information {
    private PeopleType pType;
    private String firstName;
    private String midName;
    private String thirdName;
    private LocalDate dateOfBirth;
    private String city;
    private String street;
    private String house;
    private String phoneNumber;
    private int course;
    private LocalDate dateOfEntry;
    private String firstNameMother;
    private String midNameMother;
    private String thirdNameMother;

    public Information() {
    }

    public Information(PeopleType pType, String firstName, String midName,
                       String thirdName, LocalDate dateOfBirth, String city,
                       String street, String house, String houseNumber,
                       String phoneNumber, int course, LocalDate dateOfEntry,
                       String firstNameMother, String midNameMother,
                       String thirdNameMother) {
        this.pType = pType;
        this.firstName = firstName;
        this.midName = midName;
        this.thirdName = thirdName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.street = street;
        this.house = house;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.dateOfEntry = dateOfEntry;
        this.firstNameMother = firstNameMother;
        this.midNameMother = midNameMother;
        this.thirdNameMother = thirdNameMother;
    }

    public PeopleType getpType() {
        return pType;
    }

    public void setpType(PeopleType pType) {
        this.pType = pType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public String getFirstNameMother() {
        return firstNameMother;
    }

    public void setFirstNameMother(String firstNameMother) {
        this.firstNameMother = firstNameMother;
    }

    public String getMidNameMother() {
        return midNameMother;
    }

    public void setMidNameMother(String midNameMother) {
        this.midNameMother = midNameMother;
    }

    public String getThirdNameMother() {
        return thirdNameMother;
    }

    public void setThirdNameMother(String thirdNameMother) {
        this.thirdNameMother = thirdNameMother;
    }

    @Override
    public String toString() {
        return "Information{" +
                "pType=" + pType +
                ", firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", course=" + course +
                ", dateOfEntry=" + dateOfEntry +
                ", firstNameMother='" + firstNameMother + '\'' +
                ", midNameMother='" + midNameMother + '\'' +
                ", thirdNameMother='" + thirdNameMother + '\'' +
                '}';
    }

}
