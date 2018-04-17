package com.rekeningrijden.europe.dtos;

public class TransLocationDto {
    private String lat;                 //Latitude from car tracker created at simulation system.
    private String lon;                 //Longitude from car tracker created at simulation system.
    private String dateTime;            //Date and time of this TransLocation.
    private String serialNumber;        //Serial number of the car tracker, used in the government system to find the hashed license plate and owner.
    private String countryCode;         //Country where this TransLocation is driven at.

    public TransLocationDto(String lat, String lon, String dateTime, String serialNumber, String countryCode) {
        this.lat = lat;
        this.lon = lon;
        this.dateTime = dateTime;
        this.serialNumber = serialNumber;
        this.countryCode = countryCode;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
