package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

import com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing.DocumentType;

public class TxtDocumentFactory implements DocumentFactory{
    @Override
    public DocumentParser createDocumentParser() {
        return new TxtDocumentParser();
    }

    @Override
    public DocumentProcessors createDocumentProcessor() {
        return new TxtDocumentProcessors();
    }

    @Override
    public DocumentPrinter createDocumentPrinter() {
        return new TxtDocumentPrinter();
    }

    @Override
    public boolean supportsType(String type) {
        return DocumentType.TEXT.equals(type.toUpperCase());
    }
}
