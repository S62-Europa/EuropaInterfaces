package com.rekeningrijden.europe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

/**
 * Translocation data transfer object used to communicate via a uniform way with
 * the international European systems.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransLocationDto implements Serializable {
    /**
     * Latitude from car tracker created at simulation system.
     */
    @NonNull
    private double lat;

    /**
     * Longitude from car tracker created at simulation system.
     */
    @NonNull
    private double lon;

    /**
     * Date and time of this TransLocation.
     */
    @NonNull
    private String dateTime;

    /**
     * Unique serial number of the car tracker, used in the government
     * administration system to find the car and its owner.
     */
    @NonNull
    private String serialNumber;

    /**
     * Country where this TransLocation is driven at.
     */
    @NonNull
    private String countryCode;
}
