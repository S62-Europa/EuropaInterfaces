package com.rekeningrijden.europe.interfaces;

public interface ISubInvoice {
    /**
     * @return The unique identification number.
     */
    String getInvoiceNumber();

    /**
     * @return The country which issued the (sub-)invoice.
     */
    String getCountry();

    /**
     * @return The status whether the (sub-)invoice has been payed.
     */
    boolean getPaymentStatus();

    /**
     * @return The date the (sub-)invoice was issued.
     */
    String getInvoiceDate();

    /**
     * @return The price calculated for the (sub-)invoice. The price is
     * calcuated by the country where vehicle travelled.
     */
    double getPrice();
}
