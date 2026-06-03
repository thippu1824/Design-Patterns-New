package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class TxtDocumentProcessors implements DocumentProcessors {
    @Override
    public void process() {
        System.out.println("Processing text document");
    }
}
