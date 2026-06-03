package com.example.Design.Pattern.structural.Adapter.GoogleApi;

import java.util.List;

public class MicrosoftTranslationAdapter implements TranslationProviderAdapter {

    private MicrosoftTranslateApi microsoftTranslateApi;

    public MicrosoftTranslationAdapter(MicrosoftTranslateApi microsoftTranslateApi) {
        this.microsoftTranslateApi = microsoftTranslateApi;
    }

    @Override
    public String translate(TranslationRequest request) {

        return microsoftTranslateApi.translate(request.getText(), request.getSourceLanguage(),
            request.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getLanguages();
    }
}
