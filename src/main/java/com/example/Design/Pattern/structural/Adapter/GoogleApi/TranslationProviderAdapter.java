package com.example.Design.Pattern.structural.Adapter.GoogleApi;

import java.util.List;

public interface TranslationProviderAdapter {

    String translate(TranslationRequest request);
    List<String > getSupportedLanguages();
}
