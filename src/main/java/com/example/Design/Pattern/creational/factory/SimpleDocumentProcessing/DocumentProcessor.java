package com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing;

public abstract class DocumentProcessor {

    protected String documentName;

    protected DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    protected String getDocumentName() {
        return documentName;
    }

    protected void open() {
        System.out.println("Opening a document : " + documentName);
    }

    protected abstract boolean supportsType(DocumentType type);

    protected abstract void process();
}
