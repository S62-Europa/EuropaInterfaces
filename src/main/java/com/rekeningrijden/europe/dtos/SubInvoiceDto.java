package com.rekeningrijden.europe.dtos;

public class SubInvoiceDto {
    private String invoiceNumber;
    private String country;             //Country where the SubInvoice has to be payed to.
    private String paymentStatus;      //Is this sub invoice payed already/
    private String invoiceDate;         //Date of the subinvoice
    private String price;               //Price calculated by the country where the subinvoice is made and where the user has driven.

    public SubInvoiceDto(String invoiceNumber, String country, String paymentStatus, String invoiceDate, String price) {
        this.invoiceNumber = invoiceNumber;
        this.country = country;
        this.paymentStatus = paymentStatus;
        this.invoiceDate = invoiceDate;
        this.price = price;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getPrice() {
        return price;
    }
}
