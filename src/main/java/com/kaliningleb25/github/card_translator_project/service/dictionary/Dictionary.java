package com.kaliningleb25.github.card_translator_project.service.dictionary;

import com.kaliningleb25.github.card_translator_project.service.translate_api.TranslateAPI;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dictionary {
    public static String makeDictionary(String words, String sourceLang, String targetLang) throws IOException {
        Map<String, String> langs = TranslateAPI.getLanguages();
        Map<String, String> dict = new LinkedHashMap<>();

        String source = isAutoDetect(sourceLang) ?
                TranslateAPI.detectLanguage(words) :
                TranslateAPI.getKey(langs, sourceLang);

        String target = TranslateAPI.getKey(langs, targetLang);

//        dict.put(words, TranslateAPI.translate(words, source, target));

        String output = TranslateAPI.translate(words, source, target);

//        return dict;
        return output;
    }

    private static boolean isAutoDetect(String sourceLang) {
        return sourceLang.equalsIgnoreCase("auto");
    }
}
