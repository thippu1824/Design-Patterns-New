package com.example.Design.Pattern.structural.Adapter.GoogleApi;

public class Main {

    public static void main(String[] args) {

        TranslationProviderAdapter adapter = new MicrosoftTranslationAdapter(new MicrosoftTranslateApi());

        TranslationRequest translationRequest = new TranslationRequest();
        translationRequest.setText("Hello");
        translationRequest.setSourceLanguage("english");
        translationRequest.setTargetLanguage("hindi");

        String translate = adapter.translate(translationRequest);

        System.out.println(translate);

    }
}
