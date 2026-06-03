package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class TxtDocumentParser implements DocumentParser{
    @Override
    public void parse() {
        System.out.println("Parsing text document");
    }
}
