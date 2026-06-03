package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class ExcelDocumentProcessors implements DocumentProcessors {
    @Override
    public void process() {
        System.out.println("Processing xlsx document");
    }
}
