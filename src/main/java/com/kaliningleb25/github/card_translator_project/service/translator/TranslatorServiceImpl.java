package com.kaliningleb25.github.card_translator_project.service.translator;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static com.kaliningleb25.github.card_translator_project.service.dictionary.Dictionary.makeDictionary;

@Service
public class TranslatorServiceImpl implements TranslatorService {
    @Override
    public String getWordsTranslations(String words, String sourceLang, String targetLang) throws IOException, ExecutionException, InterruptedException {
        return makeDictionary(words, sourceLang, targetLang);
    }
}
