package com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing;

public class Main {

    public static void main(String[] args) {

        DocumentProcessor documentProcessor =
            DocumentProcessorFactory.createDocumentProcessor(DocumentType.TEXT, "notes.txt");

        documentProcessor.open();
        documentProcessor.process();

    }
}
