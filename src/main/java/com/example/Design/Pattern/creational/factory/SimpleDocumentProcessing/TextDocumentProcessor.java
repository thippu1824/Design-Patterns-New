package com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing;

public class TextDocumentProcessor extends DocumentProcessor{

    protected TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    protected boolean supportsType(DocumentType type) {
        return type == DocumentType.TEXT;
    }

    @Override
    protected void process() {
        System.out.println("Processing TXT document :" + documentName);
    }
}
