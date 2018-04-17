package com.rekeningrijden.europe.interfaces;

import java.util.List;

public interface IVehicle {
    /**
     * @return The hashed license plate of the car.
     */
    String getHashedLicensePlate();

    /**
     * @return The list of all journeys a vehicle has made.
     */
    List<IJourney> getJourneys();
    
    /**
     * @return The list of all (sub-)invoices which have been issued to this
     * vehicle.
     */
    List<ISubInvoice> getSubInvoices();
}
