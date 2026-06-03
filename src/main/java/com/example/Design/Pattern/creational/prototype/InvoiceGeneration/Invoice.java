package com.example.Design.Pattern.creational.prototype.InvoiceGeneration;

import java.time.LocalDate;

public class Invoice implements ObjectCloneable<Invoice> {

    private String invoiceId;
    private String customerName;
    private Double amount;
    private LocalDate dueDate;
    private String invoiceType;

    public Invoice() {
    }

    public Invoice(String invoiceId, String customerName, Double amount, LocalDate dueDate, String invoiceType) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.dueDate = dueDate;
        this.invoiceType = invoiceType;
    }

    @Override
    public Invoice clone() {
        Invoice invoiceCopy = new Invoice();
        invoiceCopy.invoiceId = this.invoiceId;
        invoiceCopy.customerName = this.customerName;
        invoiceCopy.amount = this.amount;
        invoiceCopy.dueDate = this.dueDate;
        invoiceCopy.invoiceType = this.invoiceType;
        return invoiceCopy;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Override
    public String toString() {
        return "Invoice{" +
            "invoiceId='" + invoiceId + '\'' +
            ", customerName='" + customerName + '\'' +
            ", amount=" + amount +
            ", dueDate=" + dueDate +
            ", invoiceType='" + invoiceType + '\'' +
            '}';
    }
}
