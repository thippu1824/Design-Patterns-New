package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

import com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing.DocumentType;

public class ExcelDocumentFactory implements DocumentFactory{
    @Override
    public DocumentParser createDocumentParser() {
        return new ExcelDocumentParser();
    }

    @Override
    public DocumentProcessors createDocumentProcessor() {
        return new ExcelDocumentProcessors();
    }

    @Override
    public DocumentPrinter createDocumentPrinter() {
        return new ExcelDocumentPrinter();
    }

    @Override
    public boolean supportsType(String type) {
        return DocumentType.XLSX.equals(type.toUpperCase());
    }
}
