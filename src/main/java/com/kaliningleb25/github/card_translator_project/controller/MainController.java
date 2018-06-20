package com.kaliningleb25.github.card_translator_project.controller;

import com.kaliningleb25.github.card_translator_project.entity.Card;
import com.kaliningleb25.github.card_translator_project.service.CardService;
import com.kaliningleb25.github.card_translator_project.service.translator.TranslatorService;
import com.kaliningleb25.github.card_translator_project.service.translator.TranslatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Controller
public class MainController {

    @Autowired
    CardService cardService;

    @Autowired
    TranslatorService translatorService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/addCard")
    public String createNewCardPage() {
        return "createCard";
    }

    @PostMapping("/addCard")
    public String addNewCard(@RequestParam String srcWord) {

        TranslatorServiceImpl translator = new TranslatorServiceImpl();
        String outWord = null;

        try {
            outWord = translator.getWordsTranslations(srcWord, "auto", "russian");
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        cardService.addCard(new Card(srcWord, outWord, null));

        return "index";
    }

}
