package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class ExcelDocumentPrinter implements DocumentPrinter{
    @Override
    public void print() {
        System.out.println("Printing xlsx document");
    }
}
