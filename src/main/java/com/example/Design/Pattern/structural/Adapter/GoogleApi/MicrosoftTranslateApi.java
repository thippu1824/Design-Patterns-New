package com.example.Design.Pattern.structural.Adapter.GoogleApi;

import java.util.List;

public class MicrosoftTranslateApi {

    public String translate(String text, String src, String tgt) {
        return "Microsoft translated : " + text;
    }

    public List<String> getLanguages() {
        return List.of("hindi", "tamil", "kannada");
    }
}
