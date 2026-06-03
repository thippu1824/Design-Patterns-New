package com.example.Design.Pattern.creational.factory.SimpleDocumentProcessing;

public class DocumentProcessorFactory {

    protected static DocumentProcessor createDocumentProcessor(DocumentType documentType, String documentName) {

        switch (documentType) {

            case TEXT:
                return new TextDocumentProcessor(documentName);

            case XLSX:
                return new XLSXDocumentProcessor(documentName);

            case PDF:
                return new PDFDocumentProcessor(documentName);

            default:
                throw new IllegalArgumentException("Unsupported document type");
        }

    }
}
