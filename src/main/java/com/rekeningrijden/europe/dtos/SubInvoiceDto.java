package com.rekeningrijden.europe.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubInvoiceDto implements Serializable {
    /**
     * primary key as a UUID.
     */
    @NonNull
    public UUID invoiceNumber;

    /**
     * Country where the SubInvoice has to be payed to.
     */
    @NonNull
    public String country;

    /**
     * Is this sub invoice payed already.
     */
    @NonNull
    public String paymentStatus;

    /**
     * Date of the subinvoice.
     */
    @NonNull
    public String invoiceDate;

    /**
     * Price calculated by the country where the subinvoice is made and where the user has driven.
     */
    @NonNull
    public int price;

    /**
     * Get the serial number of the tracker inside a vehicle, used to determine to which vehicle an SubInvoice belongs
     */
    @NonNull
    public String carTrackerId;
}
