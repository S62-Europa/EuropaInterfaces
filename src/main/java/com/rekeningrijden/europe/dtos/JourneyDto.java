package com.rekeningrijden.europe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Journey data transfer object used to communicate via a uniform way with the
 * international European systems.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JourneyDto implements Serializable {
    /**
     * Translocations which make up a journey. A journey has been determined
     * when a break of at least 10 minutes has been detected between two
     * translocations.
     */
    @NonNull
    private List<TransLocationDto> transLocationDtos
            = new ArrayList<TransLocationDto>();
}
