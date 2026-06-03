package com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing;

public class XLSXDocumentProcessor extends DocumentProcessor{

    protected XLSXDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    protected boolean supportsType(DocumentType type) {
        return type == DocumentType.XLSX;
    }

    @Override
    protected void process() {
        System.out.println("Processing XLSX Document :" + documentName);
    }
}
