package Dtos;

import java.util.List;

public class VehicleDto {
    String HashedLicensePlate;             //Hashes license plate of the car, used to find the owner at the government system.
    List<JourneyDto> Journeys;               //List of all journeys this car made.
    List<SubInvoiceDto> SubInvoices;         //List of all sub invoices this car made.
}
