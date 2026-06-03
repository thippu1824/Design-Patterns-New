package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class ExcelDocumentParser implements DocumentParser{
    @Override
    public void parse() {
        System.out.println("Parsing xlsx document");
    }
}
