package com.rekeningrijden.europe.dtos;

import java.io.Serializable;

public class VehicleDto implements Serializable {

    private String hashedLicensePlate;
    private String journeyUri;
    private String subInvoiceUri;

    public VehicleDto() {
    }

    public VehicleDto(String hashedLicensePlate, String journeyUri, String subInvoiceUri) {
        this.hashedLicensePlate = hashedLicensePlate;
        this.journeyUri = journeyUri;
        this.subInvoiceUri = subInvoiceUri;
    }

    public void setHashedLicensePlate(String hashedLicensePlate) {
        this.hashedLicensePlate = hashedLicensePlate;
    }

    public void setJourneyUri(String journeyUri) {
        this.journeyUri = journeyUri;
    }

    public void setSubInvoiceUri(String subInvoiceUri) {
        this.subInvoiceUri = subInvoiceUri;
    }

    public String getHashedLicensePlate() {
        return hashedLicensePlate;
    }

    public String getJourneyUri() {
        return journeyUri;
    }

    public String getSubInvoiceUri() {
        return subInvoiceUri;
    }
}
