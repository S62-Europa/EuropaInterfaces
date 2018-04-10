package Dtos;

public class TransLocationDto {
    Double Lat;                 //Latitude from car tracker created at simulation system.
    Double Lon;                 //Longitude from car tracker created at simulation system.
    String DateTime;            //Date and time of this TransLocation.
    String SerialNumber;        //Serial number of the car tracker, used in the government system to find the hashed license plate and owner.
    String CountryCode;         //Country where this TransLocation is driven at.
}
