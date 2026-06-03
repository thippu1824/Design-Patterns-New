package com.example.Design.Pattern.structural.Adapter.GoogleApi;

import java.util.List;

public class GoogleTranslationAdapter implements TranslationProviderAdapter{

    private GoogleTranslateApi googleTranslateApi;

    public GoogleTranslationAdapter(GoogleTranslateApi googleTranslateApi) {
        this.googleTranslateApi = googleTranslateApi;
    }

    @Override
    public String translate(TranslationRequest request) {
        GoogleTranslationRequest googleTranslationRequest = googleTranslateApi.mapToGoogleRequest(request);
        return googleTranslateApi.convert(googleTranslationRequest);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
