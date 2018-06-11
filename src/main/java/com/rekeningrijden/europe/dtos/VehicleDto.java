package com.rekeningrijden.europe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Vehicle data transfer object used to communicate via a uniform way with the
 * international European systems.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto implements Serializable {
    /**
     * Hashed license plate of the car, used to find the owner via the
     * government administration system.
     */
    @NonNull
    private String hashedLicensePlate;

    /**
     * Serial number of the car tracker.
     */
    @NonNull
    private String serialNumber;

    /**
     * Origin country of the car.
     */
    @NonNull
    private String originCountry;

    /**
     * List of all journeys this car made.
     */
    @NonNull
    private List<JourneyDto> journeys = new ArrayList<JourneyDto>();

    /**
     * List of all sub invoices this car made.
     */
    @NonNull
    private List<SubInvoiceDto> subInvoices = new ArrayList<SubInvoiceDto>();
}
