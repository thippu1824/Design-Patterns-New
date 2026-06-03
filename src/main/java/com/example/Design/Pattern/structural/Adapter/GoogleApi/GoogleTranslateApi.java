package com.example.Design.Pattern.structural.Adapter.GoogleApi;

import java.util.List;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest googleTranslationRequest) {

        return "Google translated : " + googleTranslationRequest.getText();
    }

    public List<String> getLanguages() {
        return List.of("hindi", "tamil", "kannada");
    }

    public GoogleTranslationRequest mapToGoogleRequest(TranslationRequest translationRequest) {

        GoogleTranslationRequest googleTranslationRequest = new GoogleTranslationRequest();

        googleTranslationRequest.setText(translationRequest.getText());
        googleTranslationRequest.setSourceLanguage(translationRequest.getSourceLanguage());
        googleTranslationRequest.setTargetLanguage(translationRequest.getTargetLanguage());
        googleTranslationRequest.setConfidence(translationRequest.getConfidence());

        return googleTranslationRequest;
    }
}
