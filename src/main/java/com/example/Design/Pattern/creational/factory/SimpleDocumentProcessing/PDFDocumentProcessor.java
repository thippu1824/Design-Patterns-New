package com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing;

public class PDFDocumentProcessor extends DocumentProcessor {

    protected PDFDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    protected boolean supportsType(DocumentType type) {
        return type == DocumentType.PDF;
    }

    @Override
    protected void process() {
        System.out.println("Processing PDF Document : " + documentName);
    }
}
