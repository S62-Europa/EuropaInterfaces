package com.rekeningrijden.europe.interfaces;

public interface ITransLocation {
    /**
     * @return The lattitude the vehicle was located at the time of measuring.
     */
    Double getLat();

    /**
     * @return The longitude the vehicle was located at the time of measuring.
     */
    Double getLon();

    /**
     * @return The time, accurate up until the the millisecond, when the car was
     * recorded at a location.
     */
    String getDateTime();

    /**
     * @return The serial number of the car tracker used by the government to
     * keep track of the vehicles on their roads.
     */
    String getSerialNumber();

    /**
     * @return The country code of where the vehicle has driven.
     */
    String getCountryCode();
}
