package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public interface DocumentFactory {

    DocumentParser createDocumentParser();
    DocumentProcessors createDocumentProcessor();
    DocumentPrinter createDocumentPrinter();

    boolean supportsType(String type);
}
