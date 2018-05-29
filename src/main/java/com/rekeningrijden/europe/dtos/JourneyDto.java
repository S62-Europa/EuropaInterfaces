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
public class JourneyDto implements Serializable {
    @NonNull
    public List<TransLocationDto> transLocationDtos = new ArrayList<TransLocationDto>();

    @NonNull
    public String transLocationDtosURI;
}
