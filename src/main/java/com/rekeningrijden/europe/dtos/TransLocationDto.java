package com.rekeningrijden.europe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransLocationDto implements Serializable {
    /**
     * Latitude from car tracker created at simulation system.
     */
    @NonNull
    public double lat;
    /**
     * Longitude from car tracker created at simulation system.
     */
    @NonNull
    public double lon;
    /**
     * Date and time of this TransLocation.
     */
    @NonNull
    public String dateTime;
    /**
     * Serial number of the car tracker, used in the government system to find the hashed license plate and owner.
     */
    @NonNull
    public String serialNumber;
    /**
     * Country where this TransLocation is driven at.
     */
    @NonNull
    public String countryCode;
}
