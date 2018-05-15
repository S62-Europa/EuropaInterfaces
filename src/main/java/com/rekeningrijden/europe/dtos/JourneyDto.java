package com.rekeningrijden.europe.dtos;

import java.io.Serializable;

public class JourneyDto implements Serializable {

    private Long id;
    private String translocationUri;

    public JourneyDto() {
    }

    public JourneyDto(Long id, String translocationUri) {
        this.id = id;
        this.translocationUri = translocationUri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTranslocationUri() {
        return translocationUri;
    }

    public void setTranslocationUri(String translocationUri) {
        this.translocationUri = translocationUri;
    }
}

