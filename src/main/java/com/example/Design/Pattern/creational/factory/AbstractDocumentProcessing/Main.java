package com.example.Design.Pattern.creational.factory.AbstractDocumentProcessing;

public class Main {

    public static void main(String[] args) {


        TxtDocumentFactory txtDocumentFactory = new TxtDocumentFactory();

        DocumentParser documentParser = txtDocumentFactory.createDocumentParser();
        DocumentProcessors documentProcessors = txtDocumentFactory.createDocumentProcessor();
        DocumentPrinter documentPrinter = txtDocumentFactory.createDocumentPrinter();

        documentParser.parse();
        documentProcessors.process();
        documentPrinter.print();

    }
}
