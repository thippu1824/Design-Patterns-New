package com.example.Design.Pattern.creational.prototype.InvoiceGeneration;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    private final Map<String, Invoice> registry = new HashMap<>();

    @Override
    public void addPrototype(String type, Invoice invoice) {
        registry.put(type, invoice);
    }

    @Override
    public Invoice getPrototype(String type) {
        return registry.get(type);
    }

    @Override
    public Invoice cloneInvoiceObject(String type) {
        Invoice prototype = registry.get(type);
        if (prototype == null) {
            throw new RuntimeException("No prototype found for type :" + type);
        }
        return prototype.clone();
    }
}
