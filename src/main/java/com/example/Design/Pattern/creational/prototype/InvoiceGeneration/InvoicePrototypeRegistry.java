package com.example.Design.Pattern.creational.prototype.InvoiceGeneration;

public interface InvoicePrototypeRegistry {
    void addPrototype(String type, Invoice invoice);
    Invoice getPrototype(String type);
    Invoice cloneInvoiceObject(String type);
}
