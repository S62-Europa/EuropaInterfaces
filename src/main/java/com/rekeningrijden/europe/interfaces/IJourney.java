package com.rekeningrijden.europe.interfaces;

import java.util.List;

// When a vehicle has been standing in the same spot for 15 minutes, the
// registration system creates a Journey with all of its corresponding
// translocations.
//
// The simulation system generates a translocation every minute.
public interface IJourney {
    /**
     * @return A list of all locations of this journey.
     */
    List<ITransLocation> getTransLocations();
}
