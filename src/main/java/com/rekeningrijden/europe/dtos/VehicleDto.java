package com.rekeningrijden.europe.dtos;

import java.util.List;

public class VehicleDto {
    /**
     * Hashes license plate of the car, used to find the owner at the government system.
     */
    private String HashedLicensePlate;
    /**
     * List of all journeys this car made.
     */
    private List<JourneyDto> Journeys;               
    /**
     * List of all sub invoices this car made.
     */
    private List<SubInvoiceDto> SubInvoices;

    public VehicleDto(String hashedLicensePlate, List<JourneyDto> journeys, List<SubInvoiceDto> subInvoices) {
        HashedLicensePlate = hashedLicensePlate;
        Journeys = journeys;
        SubInvoices = subInvoices;
    }

    public String getHashedLicensePlate() {
        return HashedLicensePlate;
    }

    public List<JourneyDto> getJourneys() {
        return Journeys;
    }

    public List<SubInvoiceDto> getSubInvoices() {
        return SubInvoices;
    }
}
