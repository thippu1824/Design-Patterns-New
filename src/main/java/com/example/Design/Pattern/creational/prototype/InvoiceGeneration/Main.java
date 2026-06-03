package com.example.Design.Pattern.creational.prototype.InvoiceGeneration;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        InvoicePrototypeRegistry registry = new InvoicePrototypeRegistryImpl();

        Invoice retailInvoice = new Invoice("101", "swamy", 10000.00, LocalDate.now().plusDays(30), "Retail");

        Invoice corporateInvoice = new Invoice("201", "AOF", 2000.35, LocalDate.now().plusDays(20), "Corporate");

        registry.addPrototype("Retail", retailInvoice);
        registry.addPrototype("Corporate", corporateInvoice);

        //Cloning retail invoice
        Invoice retailInvoiceCloned = registry.cloneInvoiceObject("Retail");

        retailInvoiceCloned.setInvoiceId("102");
        retailInvoiceCloned.setCustomerName("Charlyn");

        System.out.println("original invoice" + retailInvoice);
        System.out.println("Cloned invoice " + retailInvoiceCloned);

        System.out.println(retailInvoice == retailInvoiceCloned);

    }
}
