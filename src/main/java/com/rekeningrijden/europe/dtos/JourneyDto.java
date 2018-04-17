package com.rekeningrijden.europe.dtos;

import java.util.List;

public class JourneyDto {
    List<TransLocationDto> transLocationDtos;

    public JourneyDto(List<TransLocationDto> transLocationDtos) {
        this.transLocationDtos = transLocationDtos;
    }

    public List<TransLocationDto> getTransLocationDtos() {
        return transLocationDtos;
    }

    public void setTransLocationDtos(List<TransLocationDto> transLocationDtos) {
        this.transLocationDtos = transLocationDtos;
    }
}
