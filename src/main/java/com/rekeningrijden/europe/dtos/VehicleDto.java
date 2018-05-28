package com.rekeningrijden.europe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto implements Serializable {
    /**
     * Hashes license plate of the car, used to find the owner at the government system.
     */
    @NonNull
    public String HashedLicensePlate;

    /**
     * Serial number of the car tracker
     */
    @NonNull
    public String serialNumber;

    /**
     * Origin country of the car
     */
    @NonNull
    public String originCountry;

    /**
     * List of all journeys this car made.
     */
    @NonNull
    public List<JourneyDto> Journeys = new ArrayList<JourneyDto>();

    /**
     * List of all sub invoices this car made.
     */
    @NonNull
    public List<SubInvoiceDto> SubInvoices = new ArrayList<SubInvoiceDto>();

    /**
     * Uri to the List of all journeys this car made.
     */
    @NonNull
    public String JourneysURI;

    /**
     * Uri to the List of all sub invoices this car made.
     */
    @NonNull
    public String SubInvoicesURI;

}
