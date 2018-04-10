package Dtos;

public class SubInvoiceDto {
    String InvoiceNumber;
    String Country;             //Country where the SubInvoice has to be payed to.
    boolean PaymentStatus;      //Is this sub invoice payed already/
    String InvoiceDate;         //Date of the subinvoice
    double Price;               //Price calculated by the country where the subinvoice is made and where the user has driven.
}
