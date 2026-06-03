package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class TxtDocumentPrinter implements DocumentPrinter{

    @Override
    public void print() {
        System.out.println("Printing text document");
    }
}
